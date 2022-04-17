package baseball.ui;

import baseball.domain.*;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Balls computerBalls;

    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;
    private static final int BALL_SIZE = 3;

    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_FINAL_CONDITION = "3스트라이크";
    private static final String GAME_FINISH_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String GAME_RESTART_OR_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void start() {
        boolean isStart = true;

        Balls computerBalls = createComputerBall();

        while (isStart) {
            isStart = gaming(computerBalls);
        }
        System.out.println(GAME_FINISH_MESSAGE);
        System.out.println(GAME_RESTART_OR_END_MESSAGE);

    }

    private boolean gaming(Balls computerBalls) {
        Balls userBalls = new Balls(inputBalls(splitReadInput()));
        Judgement judgement = new Judgement(computerBalls,userBalls);
        GameResult result = judgement.getResult();

        String printResult = result.printResultMessage();

        System.out.println(printResult);

        return !printResult.equals(GAME_FINAL_CONDITION);

    }

    private static String[] splitReadInput() {
        System.out.print(INPUT_NUMBER_MESSAGE);
        String inputBall = Console.readLine();
        return inputBall.split("");
    }

    private static List<Ball> inputBalls(String[] splitInputBall) {
        List<Ball> inputBalls = new ArrayList<>();
        for (int index = 1; index <= splitInputBall.length; index++) {
            inputBalls.add(new Ball(index, Integer.parseInt(splitInputBall[index - 1])));
        }
        return inputBalls;
    }

    private Balls createComputerBall() {
        List<Ball> balls = new ArrayList<>();

        for (int index = 0; index < BALL_SIZE; index++) {
            int randomNumber = Randoms.pickNumberInRange(MIN_BALL_NUMBER, MAX_BALL_NUMBER);
            balls.add(new Ball(index + 1, randomNumber));
        }

        return new Balls(balls);
    }


}

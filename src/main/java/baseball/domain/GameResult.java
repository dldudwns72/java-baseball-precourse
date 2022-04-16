package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private Balls computerBalls;
    private Balls userBalls;
    private List<String> ballResults = new ArrayList<>();
    private List<String> strikeResults = new ArrayList<>();

    public GameResult(Balls computerBalls, Balls userBalls) {
        this.computerBalls = computerBalls;
        this.userBalls = userBalls;
    }

    public String gameResult() {
        List<String> results = new ArrayList<>();
        for (int index = 0; index < computerBalls.getSize(); index++) {
            Judgement judgement = new Judgement(computerBalls, userBalls.getBall(index));
            results.add(judgement.getResult());
        }

        return filterBallResults(results);
    }

    private String filterBallResults(List<String> gameResults) {
        for (String gameResult : gameResults) {
            separateResultByJudgement(gameResult);
        }
        return printResult();
    }

    private void separateResultByJudgement(String result) {
        if (result.equals("볼")) {
            ballResults.add("볼");
        }

        if (result.equals("스트라이크")) {
            strikeResults.add("스트라이크");
        }
    }

    private String printResult() {
        String printResult = "";
        String printBall = "";
        String printStrike = "";

        if (ballResults.size() > 0) {
            printBall = ballResults.size() + "볼";
            printResult = printBall;
        }

        if (strikeResults.size() > 0) {
            printStrike = strikeResults.size() + "스트라이크";

            if(ballResults.size() == 0){
                printResult += printStrike;
            }

            if(ballResults.size() > 0){
                printResult += " " + printStrike;
            }
        }

        if (ballResults.size() == 0 && strikeResults.size() == 0) {
            printResult = "낫싱";
        }

        return printResult;

    }


}

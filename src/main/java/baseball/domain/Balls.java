package baseball.domain;


import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final String BALL_DUPLICATION_EXCEPTION_MESSAGE = "공의 숫자는 중복될 수 없습니다.";

    private List<Ball> balls = new ArrayList<>();

    public Balls(List<Ball> balls) {
        List<Integer> prevBallNumbers = new ArrayList<>();
        for (Ball ball : balls) {
            checkDuplicatedBall(prevBallNumbers, ball);
            prevBallNumbers.add(ball.getNumber());
        }
        this.balls = balls;
    }

    private void checkDuplicatedBall(List<Integer> prevBallNumbers, Ball ball) {
        if (prevBallNumbers.contains(ball.getNumber())) {
            throw new IllegalArgumentException(BALL_DUPLICATION_EXCEPTION_MESSAGE);
        }
    }

    public Ball getBall(int index) {
        return balls.get(index);
    }

    public List<Ball> getBalls() {
        return balls;
    }

}

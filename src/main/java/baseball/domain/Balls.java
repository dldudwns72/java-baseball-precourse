package baseball.domain;


import baseball.exception.BallsException;

import java.util.ArrayList;
import java.util.List;

public class Balls {


    private List<Ball> balls;

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
            throw new BallsException();
        }
    }

    public Ball getBall(int index) {
        return balls.get(index);
    }

    public List<Ball> getBalls() {
        return balls;
    }

}

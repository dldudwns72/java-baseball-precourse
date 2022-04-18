package baseball.domain;

public class Ball {



    private Position position;

    private BallNumber number;

    public Ball(Position position, BallNumber number) {
        this.position = position;
        this.number = number;
    }


    public int getNumberByPosition(int position) {
        return number.getNumber();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public int getNumber() {
        return number.getNumber();
    }

    public boolean isStrike(Ball ball) {
        return position.equals(ball.position) && number.equals(ball.number);
    }

    public boolean isBall(Ball ball) {
        return !position.equals(ball.position) && number.equals(ball.number);
    }

}

package baseball.domain;

public class Ball {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private static final String BALL_NUMBER_EXCEPTION_MESSAGE = "공 숫자의 범위는 1~9 사이 입니다.";

    private Position position;

    private int number;

    public Ball(Position position, int number) {
        if (isOverNumber(number)) throw new IllegalArgumentException(BALL_NUMBER_EXCEPTION_MESSAGE);
        this.position = position;
        this.number = number;
    }

    private boolean isOverNumber(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    public int getNumberByPosition(int position) {
        return number;
    }

    public int getPosition() {
        return position.getPosition();
    }

    public int getNumber() {
        return number;
    }

    public boolean isStrike(Ball ball) {
        return position.equals(ball.position) && number == ball.number;
    }

    public boolean isBall(Ball ball) {
        return !position.equals(ball.position) && number == ball.number;
    }

}

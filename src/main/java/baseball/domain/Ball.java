package baseball.domain;

public class Ball {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int MIN_POSITION = 1;
    private static final int MAX_POSITION = 3;

    private static final String BALL_POSITION_EXCEPTION_MESSAGE = "공은 세자리수여야 합니다.";
    private static final String BALL_NUMBER_EXCEPTION_MESSAGE = "공 숫자의 범위는 1~9 사이 입니다.";

    private int position;

    private int number;

    public Ball(int position, int number) {
        if (isOverPosition(position)) throw new IllegalArgumentException(BALL_POSITION_EXCEPTION_MESSAGE);
        if (isOverNumber(number)) throw new IllegalArgumentException(BALL_NUMBER_EXCEPTION_MESSAGE);
        this.position = position;
        this.number = number;
    }

    private boolean isOverPosition(int position) {
        return position < MIN_POSITION || position > MAX_POSITION;
    }

    private boolean isOverNumber(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    public int getNumberByPosition(int position) {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public boolean isStrike(Ball ball) {
        return position == ball.position && number == ball.number;
    }

    public boolean isBall(Ball ball) {
        return position != ball.position && number == ball.number;
    }

}

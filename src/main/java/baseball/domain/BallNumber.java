package baseball.domain;


public class BallNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final String BALL_NUMBER_EXCEPTION_MESSAGE = "공 숫자의 범위는 1~9 사이 입니다.";

    private int number;

    public BallNumber(int number) {
        if (isOverNumber(number)) throw new IllegalArgumentException(BALL_NUMBER_EXCEPTION_MESSAGE);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private boolean isOverNumber(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

}

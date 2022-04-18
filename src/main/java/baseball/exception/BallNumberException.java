package baseball.exception;

public class BallNumberException extends RuntimeException {

    private static final String BALL_NUMBER_EXCEPTION_MESSAGE = "공 숫자의 범위는 1~9 사이 입니다.";

    public BallNumberException() {
        super(BALL_NUMBER_EXCEPTION_MESSAGE);
    }
}

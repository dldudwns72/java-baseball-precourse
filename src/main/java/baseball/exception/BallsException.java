package baseball.exception;

public class BallsException extends IllegalArgumentException{
    private static final String BALL_DUPLICATION_EXCEPTION_MESSAGE = "공의 숫자는 중복될 수 없습니다.";

    public BallsException(){
        super(BALL_DUPLICATION_EXCEPTION_MESSAGE);
    }

}

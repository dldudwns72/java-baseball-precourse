package baseball.exception;

public class PositionException extends IllegalArgumentException{
    private static final String BALL_POSITION_EXCEPTION_MESSAGE = "공은 세자리수여야 합니다.";

    public PositionException(){
        super(BALL_POSITION_EXCEPTION_MESSAGE);
    }
}

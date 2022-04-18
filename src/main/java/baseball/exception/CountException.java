package baseball.exception;

public class CountException extends IllegalArgumentException{
    private static final String COUNT_ERROR_MESSAGE = " 0보다 크고 3보다 작아야합니다";

    public CountException(){
        super(COUNT_ERROR_MESSAGE);
    }
}

package baseball.domain;

public class StrikeCount {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int MAX_RESULT_COUNT = 3;

    private static final String STRIKE_COUNT_ERROR_MESSAGE = "스트라이크는 0보다 크고 3보다 작아야합니다";

    private int strikeCount;

    public StrikeCount(int strikeCount) {
        validate(strikeCount);
        this.strikeCount = strikeCount;
    }

    private void validate(int strikeCount){
        if(strikeCount < MIN_RESULT_COUNT || strikeCount > MAX_RESULT_COUNT ) {
            throw new IllegalArgumentException(STRIKE_COUNT_ERROR_MESSAGE);
        }

    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void addStrikeCount(){
        this.strikeCount++;
    }
}

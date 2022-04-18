package baseball.domain;

public class Count {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int MAX_RESULT_COUNT = 3;

    private static final String COUNT_ERROR_MESSAGE = " 0보다 크고 3보다 작아야합니다";

    private int count;

    public Count(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(int ballCount) {
        if (ballCount < MIN_RESULT_COUNT || ballCount > MAX_RESULT_COUNT) {
            throw new IllegalArgumentException(COUNT_ERROR_MESSAGE);
        }
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        this.count++;
    }
}

package baseball.domain;

import baseball.exception.CountException;

public class Count {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int MAX_RESULT_COUNT = 3;

    private int count;

    public Count(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(int ballCount) {
        if (ballCount < MIN_RESULT_COUNT || ballCount > MAX_RESULT_COUNT) {
            throw new CountException();
        }
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        this.count++;
    }
}

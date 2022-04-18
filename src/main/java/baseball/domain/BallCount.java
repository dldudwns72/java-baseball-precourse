package baseball.domain;

public class BallCount {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int MAX_RESULT_COUNT = 3;

    private static final String BALL_COUNT_ERROR_MESSAGE = "볼 0보다 크고 3보다 작아야합니다";

    private int ballCount;

    public BallCount(int ballCount) {
        validate(ballCount);
        this.ballCount = ballCount;
    }

    private void validate(int ballCount){
        if(ballCount < MIN_RESULT_COUNT || ballCount > MAX_RESULT_COUNT ) {
            throw new IllegalArgumentException(BALL_COUNT_ERROR_MESSAGE);
        }

    }

    public int getBallCount() {
        return ballCount;
    }

    public void addBallCount(){
        this.ballCount++;
    }
}

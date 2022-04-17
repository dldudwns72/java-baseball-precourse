package baseball.domain;

public class GameResult {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int MAX_RESULT_COUNT = 3;

    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String EMPTY_MESSAGE = "";

    private int strikeCount;
    private int ballCount;

    public void addStrikeCount() {
        this.strikeCount++;
    }

    public void addBallCount() {
        this.ballCount++;
    }

    public String printResultMessage() {
        if (strikeCount == 0 && ballCount == 0)
            return NOTHING_MESSAGE;
        return printBallCount() + printStrikeCount();
    }

    private String printStrikeCount() {
        if (strikeCount > MIN_RESULT_COUNT)
            return strikeCount + STRIKE_MESSAGE;
        return EMPTY_MESSAGE;
    }

    private String printBallCount() {
        if (ballCount > MIN_RESULT_COUNT)
            return ballCount + BALL_MESSAGE + " ";

        return EMPTY_MESSAGE;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }
}

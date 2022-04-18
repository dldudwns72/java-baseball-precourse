package baseball.domain;

public class GameResult {

    private static final int MIN_RESULT_COUNT = 0;
    private static final int DEFAULT_COUNT = 0;

    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String EMPTY_MESSAGE = "";

    private StrikeCount strikeCount;
    private int ballCount;

    public GameResult(){
        strikeCount = new StrikeCount(DEFAULT_COUNT);
    }

    public void addStrikeCount() {
        strikeCount.addStrikeCount();
    }

    public void addBallCount() {
        this.ballCount++;
    }

    public String printResultMessage() {
        if (strikeCount.getStrikeCount() == MIN_RESULT_COUNT && ballCount == MIN_RESULT_COUNT)
            return NOTHING_MESSAGE;
        return printBallCount() + printStrikeCount();
    }

    private String printStrikeCount() {
        if (strikeCount.getStrikeCount() > MIN_RESULT_COUNT)
            return strikeCount.getStrikeCount() + STRIKE_MESSAGE;
        return EMPTY_MESSAGE;
    }

    private String printBallCount() {
        if (ballCount > MIN_RESULT_COUNT)
            return ballCount + BALL_MESSAGE + " ";

        return EMPTY_MESSAGE;
    }

    public int getStrikeCount() {
        return strikeCount.getStrikeCount();
    }

    public int getBallCount() {
        return ballCount;
    }
}

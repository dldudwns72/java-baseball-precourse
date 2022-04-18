package baseball.domain;

public class GameResult {

    private static final int DEFAULT_COUNT = 0;

    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String EMPTY_MESSAGE = "";

    private StrikeCount strikeCount;
    private BallCount ballCount;

    public GameResult(){
        strikeCount = new StrikeCount(DEFAULT_COUNT);
        ballCount = new BallCount(DEFAULT_COUNT);
    }

    public void addStrikeCount() {
        strikeCount.addStrikeCount();
    }

    public void addBallCount() {
        ballCount.addBallCount();
    }

    public String printResultMessage() {
        if (strikeCount.getStrikeCount() == DEFAULT_COUNT && ballCount.getBallCount() == DEFAULT_COUNT)
            return NOTHING_MESSAGE;
        return printBallCount() + printStrikeCount();
    }

    private String printStrikeCount() {
        if (strikeCount.getStrikeCount() > DEFAULT_COUNT)
            return strikeCount.getStrikeCount() + STRIKE_MESSAGE;
        return EMPTY_MESSAGE;
    }

    private String printBallCount() {
        if (ballCount.getBallCount() > DEFAULT_COUNT)
            return ballCount.getBallCount() + BALL_MESSAGE + " ";

        return EMPTY_MESSAGE;
    }

    public int getStrikeCount() {
        return strikeCount.getStrikeCount();
    }

    public int getBallCount() {
        return ballCount.getBallCount();
    }
}

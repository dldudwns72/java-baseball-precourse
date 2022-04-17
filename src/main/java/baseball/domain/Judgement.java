package baseball.domain;

public class Judgement {

    private Balls computerBalls;
    private Balls userBalls;
    private GameResult result = new GameResult();

    public Judgement(Balls computerBalls, Balls userBalls) {
        this.computerBalls = computerBalls;
        this.userBalls = userBalls;
        compare();
    }

    public GameResult getResult(){
        return result;
    }

    public void compare() {
        for (Ball computerBall : computerBalls.getBalls()) {
            compareUserBalls(computerBall);
        }
    }

    private void compareUserBalls(Ball computerBall) {
        for (Ball userBall : userBalls.getBalls()) {
            checkStrike(userBall, computerBall);
            checkBall(userBall, computerBall);
        }
    }

    private void checkStrike(Ball userBall, Ball computerBall) {
        if (userBall.isStrike(computerBall))
            result.addStrikeCount();
    }

    private void checkBall(Ball userBall, Ball computerBall) {
        if (userBall.isBall(computerBall))
            result.addBallCount();
    }


}


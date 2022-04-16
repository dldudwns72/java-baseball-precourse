package baseball.domain;

public class Judgement {

    private Balls computerBalls;
    private Ball userBall;

    public Judgement(Balls computerBalls, Ball userBall) {
        this.computerBalls = computerBalls;
        this.userBall = userBall;
    }

    public String getResult() {
        for (Ball computerBall : computerBalls.getBalls()) {
            return checkBall(computerBall);
        }
        return "낫싱";
    }

    private String checkBall(Ball computerBall) {
        if (isEqualNumber(computerBall)) {
            return checkBallPosition(computerBall);
        }
        return "볼";
    }

    private String checkBallPosition (Ball computerBall) {
        if (isEqualPosition(computerBall)) {
            return "스트라이크";
        }
        return "볼";
    }

    private boolean isEqualNumber(Ball computerBall){
        return computerBall.getNumber() == userBall.getNumber();
    }

    private boolean isEqualPosition(Ball computerBall){
        return computerBall.getPosition() == userBall.getPosition();
    }
}

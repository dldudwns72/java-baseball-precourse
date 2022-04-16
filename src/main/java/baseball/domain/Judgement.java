package baseball.domain;

public class Judgement {

    private Ball computerBall;
    private Ball userBall;

    public Judgement(Ball computerBall, Ball userBall) {
        this.computerBall = computerBall;
        this.userBall = userBall;
    }

    public String getResult(){
        if(computerBall.getNumber() == userBall.getNumber()){
           return judgeStrikeOrBall();
        }

        return "볼";

    }

    private String judgeStrikeOrBall(){
        if(computerBall.getPosition() == userBall.getPosition()){
            return "스트라이크";
        }
        return "볼";
    }

}

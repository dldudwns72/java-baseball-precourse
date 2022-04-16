package baseball.domain;

public class Ball {

    private final String BALL_POSITION_EXCEPTION_MESSAGE = "공 위치의 범위는 1~3입니다.";
    private final String BALL_NUMBER_EXCEPTION_MESSAGE = "공 숫자의 범위는 0~9 사이 입니다.";

    private int position;

    private int number;

    public Ball(int position, int number){
        if(isOverPosition(position)) throw new IllegalArgumentException(BALL_POSITION_EXCEPTION_MESSAGE);
        if(isOverNumber(number) ) throw new IllegalArgumentException(BALL_NUMBER_EXCEPTION_MESSAGE);
        this.position =position;
        this.number = number;
    }

    private boolean isOverPosition(int position){
        return position < 0 && position > 3;
    }

    private boolean isOverNumber(int number){
        return number < 0 && number > 9;
    }

    public int getNumberByPosition(int position){
        return number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber(){
        return number;
    }


}

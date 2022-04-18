package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallsTest {

    @Test
    @DisplayName("공 생성")
    public void createBall(){
        Ball ball = new Ball(new Position(1),1);
        assertThat(ball.getPosition()).isEqualTo(1);
        assertThat(ball.getNumber()).isEqualTo(1);
    }

    @ParameterizedTest
    @DisplayName("세자리 공 생성")
    @CsvSource(value = {"0:1","1:2","2:6"} ,delimiter = ':')
    public void createBalls(int index , int ballNumber){
        Ball ball1 = new Ball(new Position(1),1);
        Ball ball2 = new Ball(new Position(2),2);
        Ball ball3 = new Ball(new Position(3),6);
        Balls balls = new Balls(Arrays.asList(ball1,ball2,ball3));

        Ball ball = balls.getBall(index);
        assertThat(ball.getNumberByPosition(index+1)).isEqualTo(ballNumber);
    }

    @Test
    @DisplayName("중복 발생 시 IllegalArgumentException 예외 발생")
    public void duplicatedBallsException(){
        Ball ball1 = new Ball(new Position(1),1);
        Ball ball2 = new Ball(new Position(2),1);
        Ball ball3 = new Ball(new Position(3),6);

        assertThatThrownBy(() ->{
            Balls balls = new Balls(Arrays.asList(ball1,ball2,ball3));
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공의 숫자는 중복될 수 없습니다.");
    }
}
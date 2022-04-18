package baseball.domain;

import baseball.exception.BallNumberException;
import baseball.exception.PositionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BallTest {

    Ball answer;

    Ball userBall1;
    Ball userBall2;
    Ball userBall3;

    @BeforeEach
    void setUp(){
         answer = new Ball(new Position(1),new BallNumber(1));

         userBall1 = new Ball(new Position(1),new BallNumber(1));
         userBall2 = new Ball(new Position(1),new BallNumber(4));
         userBall3 = new Ball(new Position(2),new BallNumber(1));
    }

    @Test
    @DisplayName("Strike 일 경우")
    void isStrike() {
        assertTrue(answer.isStrike(userBall1));
    }

    @Test
    @DisplayName("Strike 가 아닐 경우")
    void isNotStrike() {
        assertFalse(answer.isStrike(userBall2));
    }

    @Test
    @DisplayName("Ball 일 경우")
    void isBall() {
        assertTrue(answer.isBall(userBall3));
    }

    @Test
    @DisplayName("Ball 이 아닐 경우")
    void isNotBall() {
        assertFalse(answer.isBall(userBall2));
    }

    @Test
    @DisplayName("공의 숫자가 범위를 벗어날 경우 에러 발생")
    void generateNumberException(){
        assertThatThrownBy(() ->{
            new Ball(new Position(1),new BallNumber(11));
        }).isInstanceOf(BallNumberException.class)
                .hasMessageContaining("범위는 1~9 사이");
    }

    @Test
    @DisplayName("공의 위치가 범위를 벗어날 경우 에러 발생")
    void generatePositionException(){
        assertThatThrownBy(() ->{
            new Ball(new Position(4),new BallNumber(3));
        }).isInstanceOf(PositionException.class)
                .hasMessageContaining("공은 세자리수");

    }

}

package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgementTest {

    Ball computerBall1;
    Ball userBall1;
    Ball computerBall2;
    Ball userBall2;
    Ball computerBall3;
    Ball userBall3;

    @BeforeEach
    void setUp(){
         computerBall1 = new Ball(1,1);
         userBall1 = new Ball(1,1);

         computerBall2 = new Ball(2,4);
         userBall2 = new Ball(2,3);

         computerBall3 = new Ball(3,7);
         userBall3 = new Ball(3,4);
    }

    @Test
    @DisplayName("두개의 공의 위치와 숫자가 같다면 스트라이크")
    void isStrike(){
        Judgement judgement = new Judgement(computerBall1,userBall1);
        assertThat(judgement.getResult()).isEqualTo("스트라이크");
    }

    @Test
    @DisplayName("두개의 공의 위치가 다르고 숫자가 같다면 볼")
    void isBall(){
        Judgement judgement = new Judgement(computerBall2,userBall3);
        assertThat(judgement.getResult()).isEqualTo("볼");
    }

}

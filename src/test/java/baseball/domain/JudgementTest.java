package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgementTest {

    Balls computerBalls;

    @BeforeEach
    void setUp() {
        Ball computerBall1 = new Ball(1, 1);
        Ball computerBall2 = new Ball(2, 4);
        Ball computerBall3 = new Ball(3, 7);

        computerBalls = new Balls(Arrays.asList(computerBall1,computerBall2, computerBall3));
    }

    @Test
    @DisplayName("두개의 공의 위치와 숫자가 같다면 스트라이크")
    void isStrike() {
        Ball userBall = new Ball(1,1);
        Judgement judgement = new Judgement(computerBalls, userBall);
        assertThat(judgement.getResult()).isEqualTo("스트라이크");
    }

    @Test
    @DisplayName("두개의 공의 위치가 다르고 숫자가 같다면 볼")
    void isBall() {
        Ball userBall = new Ball(3,4);
        Judgement judgement = new Judgement(computerBalls, userBall);
        assertThat(judgement.getResult()).isEqualTo("볼");
    }

}

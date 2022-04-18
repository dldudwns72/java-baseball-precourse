package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgementTest {

    Balls computerBalls;
    Balls userBalls;

    @BeforeEach
    void setUp() {
        Ball computerBall1 = new Ball(new Position(1), 1);
        Ball computerBall2 = new Ball(new Position(2), 4);
        Ball computerBall3 = new Ball(new Position(3), 7);
        computerBalls = new Balls(Arrays.asList(computerBall1, computerBall2, computerBall3));

        Ball userBall1 = new Ball(new Position(1), 1);
        Ball userBall2 = new Ball(new Position(2), 7);
        Ball userBall3 = new Ball(new Position(3), 4);
        userBalls = new Balls(Arrays.asList(userBall1, userBall2, userBall3));
    }

    @Test
    @DisplayName("스트라이크 개수 구하기")
    void getStrikeCount() {
        Judgement judgement = new Judgement(computerBalls, userBalls);
        GameResult gameResult = judgement.getResult();
        assertThat(gameResult.getStrikeCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("볼 개수 구하기")
    void getBallCount() {
        Judgement judgement = new Judgement(computerBalls, userBalls);
        assertThat(judgement.getResult().getBallCount()).isEqualTo(2);
    }


}

package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {
    Balls computerBalls;

    @BeforeEach
    void setUp(){
        Ball computerBall1 = new Ball(new Position(1), new BallNumber(1));
        Ball computerBall2 = new Ball(new Position(2), new BallNumber(4));
        Ball computerBall3 = new Ball(new Position(3), new BallNumber(7));
        computerBalls = new Balls(Arrays.asList(computerBall1, computerBall2, computerBall3));
    }

    @Test
    @DisplayName("2볼 1스트라이크 반환")
    void twoBallOneStrike(){
        Ball userBall1 = new Ball(new Position(1), new BallNumber(1));
        Ball userBall2 = new Ball(new Position(2), new BallNumber(7));
        Ball userBall3 = new Ball(new Position(3), new BallNumber(4));
        Balls userBalls = new Balls(Arrays.asList(userBall1, userBall2, userBall3));
        Judgement judgement = new Judgement(computerBalls,userBalls);

        GameResult gameResult = judgement.getResult();
        assertThat(gameResult.printResultMessage()).isEqualTo("2볼 1스트라이크");
    }

    @Test
    @DisplayName("1볼 1스트라이크 반환")
    void oneBallOneStrike(){
        Ball userBall1 = new Ball(new Position(1), new BallNumber(1));
        Ball userBall2 = new Ball(new Position(2), new BallNumber(8));
        Ball userBall3 = new Ball(new Position(3), new BallNumber(4));
        Balls userBalls = new Balls(Arrays.asList(userBall1, userBall2, userBall3));
        Judgement judgement = new Judgement(computerBalls,userBalls);

        GameResult gameResult = judgement.getResult();
        assertThat(gameResult.printResultMessage()).isEqualTo("1볼 1스트라이크");
    }

    @Test
    @DisplayName("1스트라이크 반환")
    void OneStrike(){
        Ball userBall1 = new Ball(new Position(1), new BallNumber(1));
        Ball userBall2 = new Ball(new Position(2), new BallNumber(8));
        Ball userBall3 = new Ball(new Position(3), new BallNumber(3));
        Balls userBalls = new Balls(Arrays.asList(userBall1, userBall2, userBall3));
        Judgement judgement = new Judgement(computerBalls,userBalls);

        GameResult gameResult = judgement.getResult();
        assertThat(gameResult.printResultMessage()).isEqualTo("1스트라이크");
    }

    @Test
    @DisplayName("1볼 반환")
    void OneBall(){
        Ball userBall1 = new Ball(new Position(1), new BallNumber(2));
        Ball userBall2 = new Ball(new Position(2), new BallNumber(7));
        Ball userBall3 = new Ball(new Position(3), new BallNumber(3));
        Balls userBalls = new Balls(Arrays.asList(userBall1, userBall2, userBall3));
        Judgement judgement = new Judgement(computerBalls,userBalls);

        GameResult gameResult = judgement.getResult();
        assertThat(gameResult.printResultMessage()).isEqualTo("1볼 ");
    }


}

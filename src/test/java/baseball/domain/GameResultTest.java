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
         computerBalls = new Balls(Arrays.asList(new Ball(1,1),
                                                        new Ball(2,3),
                                                        new Ball(3,5)));
    }

    @Test
    @DisplayName("1볼일 경우 게임 결과")
    void OneBall(){
        Balls userBalls = new Balls(Arrays.asList(new Ball(1,5),
                new Ball(2,7),
                new Ball(3,0)));
        GameResult result = new GameResult(computerBalls,userBalls);
        assertThat(result.gameResult()).isEqualTo("1볼");
    }

    @Test
    @DisplayName("2스트라이크일 경우 게임 결과")
    void twoStrike(){
        Balls userBalls = new Balls(Arrays.asList(new Ball(1,9),
                new Ball(2,3),
                new Ball(3,5)));
        GameResult result = new GameResult(computerBalls,userBalls);
        assertThat(result.gameResult()).isEqualTo("2스트라이크");
    }

    @Test
    @DisplayName("세자리 다 일치하지 않아 낫싱일 경우")
    void nothing(){
        Balls userBalls = new Balls(Arrays.asList(new Ball(1,9),
                new Ball(2,4),
                new Ball(3,8)));
        GameResult result = new GameResult(computerBalls,userBalls);
        assertThat(result.gameResult()).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("2볼 1스트라이크일 경우 게임 결과")
    void twoBallOneStrike(){
        Balls userBalls = new Balls(Arrays.asList(new Ball(1,5),
                new Ball(2,3),
                new Ball(3,1)));
        GameResult result = new GameResult(computerBalls,userBalls);
        assertThat(result.gameResult()).isEqualTo("2볼 1스트라이크");
    }
}

package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallCountTest {

    @Test
    @DisplayName("1개의 볼 생성")
    void getBallCount() {
        BallCount ballCount = new BallCount(2);
        assertThat(ballCount.getCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("볼 개수가 0이하일 경우 예외 발생")
    void errorBallCountUnderZero(){
        assertThatThrownBy(() ->{
            new BallCount(-4);
        }).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("볼 개수가 3이상일 경우 예외 발생")
    void errorBallCountOverThree(){
        assertThatThrownBy(() ->{
            new BallCount(4);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}

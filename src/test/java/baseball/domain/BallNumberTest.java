package baseball.domain;

import baseball.exception.BallNumberException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallNumberTest {

    @Test
    @DisplayName("공 숫자 1 반환")
    void getBallNumber(){
        BallNumber number = new BallNumber(1);
        assertThat(number.getNumber()).isEqualTo(1);
    }

    @Test
    @DisplayName("공 숫자가 10보다 클 떄 예외 발생")
    void errorBallNumberOverNine(){
        assertThatThrownBy(() ->{
            new BallNumber(10);
        }).isInstanceOf(BallNumberException.class)
                .hasMessageContaining("숫자의 범위는 1~9 사이")
        ;
    }

    @Test
    @DisplayName("공 숫자가 0보다 작을 떄 예외 발생")
    void errorBallNumberUnderZero(){
        assertThatThrownBy(() ->{
            new BallNumber(-1);
        }).isInstanceOf(BallNumberException.class)
                .hasMessageContaining("숫자의 범위는 1~9 사이")
        ;
    }

}

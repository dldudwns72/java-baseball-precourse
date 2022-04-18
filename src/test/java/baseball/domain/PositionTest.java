package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {

    @Test
    @DisplayName("위치값 1 반환")
    void getPosition(){
        Position position = new Position(1);
        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("위차 값이 3보다 클 떄 예외 발생")
    void errorPositionOverThree(){
        assertThatThrownBy(() ->{
            new Position(4);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("세자리수")
        ;
    }

    @Test
    @DisplayName("위차 값이 0보다 작을 떄 예외 발생")
    void errorPositionUnderZero(){
        assertThatThrownBy(() ->{
            new Position(-1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("세자리수")
        ;
    }



}

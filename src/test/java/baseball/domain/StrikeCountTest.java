package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StrikeCountTest {

    @Test
    @DisplayName("1개의 스트라이크 생성")
    void getStrikeCount() {
        StrikeCount strikeCount = new StrikeCount(1);
        assertThat(strikeCount.getCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("스트라이크 개수가 0이하일 경우 예외 발생")
    void errorStrikeCountUnderZero(){
        assertThatThrownBy(() ->{
            new StrikeCount(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("스트라이크 개수가 3이상일 경우 예외 발생")
    void errorStrikeCountOverThree(){
        assertThatThrownBy(() ->{
            new StrikeCount(6);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}

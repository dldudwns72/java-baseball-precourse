package baseball.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set 의 사이즈를 구하는 size 메소드 테스트")
    void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("1,2,3 값이 존재 여부 테스트")
    @ValueSource(ints = {1,2,3})
    void isContain_ShouldReturnTrueForContainNumber(int number) {
        assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @DisplayName("1,2,3 값이 존재 여부 테스트")
    @CsvSource(value = {"1:true","2:true","3:true","4:false","5:false"},delimiter = ':')
    void isContain_ShouldReturnTrueOrFalseForContainNumber(int number, boolean result) {
        assertThat(numbers.contains(number)).isEqualTo(result);
    }
    
}

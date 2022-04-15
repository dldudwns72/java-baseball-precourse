package baseball.learning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    @DisplayName("구분자로 문자열을 분리하여 배열로 반환하는 split 메서드 테스트 ")
    public void split() {
        String letter = "1,2";
        String[] splitLetter = letter.split(",");

        String onlyOneChar = "1";
        String[] splitOnlyOneChar = onlyOneChar.split(",");

        assertThat(splitLetter).contains("1");
        assertThat(splitOnlyOneChar).containsExactly("1");
    }

    @Test
    @DisplayName("문자열 자르기 substring 메소드 테스트")
    void substring() {
        String letter = "(1,2)";
        String substringLetter = letter.substring(1, 4);

        assertThat(substringLetter).isEqualTo("1,2");
    }

    public class StringException extends StringIndexOutOfBoundsException{
        private String customMessage;

         StringException(){
        }

        public StringException(String message){
            super(message);
        }
    }

    @Test
    @DisplayName("특정 위치 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException 예외 발생")
    void charAt() {
        String letter = "abc";

        assertThatThrownBy(() -> {
            try{
                letter.charAt(5);
            }catch (StringException e){
                System.out.println("안녕하세요");
            }

        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range");

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    letter.charAt(6);
                }).withMessageMatching("String index out of range: 6");
    }


}

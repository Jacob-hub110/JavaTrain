package checkxo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckXOTest {

    @Test
    void should_returnTrue_When_theSameNumberOfXAndO() {
        // given
        String input = "xxoo";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void should_returnFalse_When_NotTheSameNumberOfXAndO() {
        // given
        String input = "xoo";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void should_returnTrue_When_LettersHaveDifferentSeizures() {
        // given
        String input = "xxOo";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void should_returnTrue_When_InputHaveLettersOtherThanXAndO() {
        // given
        String input = "AaXxOo";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void should_returnFalse_When_WordIsEmpty() {
        // given
        String input = "";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void should_returnFalse_When_WordHaveNotXAndO() {
        // given
        String input = "abcd";
        // when
        boolean result = CheckXO.check(input);
        // then
        assertThat(result).isTrue();
    }
}
package wyjatki.zadanie1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void Should_returnNewUser() {
        //given & when
        User result = User.create("1234567", "999",
                "Jan", "jan@gmail.com");
        //then
        assertThat(result).isNotNull();
    }

    @Test
    void Should_throwException_When_NullProvided() {
        //given & when & then
        assertThrows(NullPointerException.class, () -> {
            User.create(null, "999", "Jan", "jan@gmail.com");
        });
    }

    @Test
    void Should_throwException_When_LoginSeizureIsLowerThan6() {
        //given & when & then
        assertThrows(IllegalArgumentException.class, () -> {
            User.create("123", "999", "Jan", "jan@gmail.com");
        });
    }
}
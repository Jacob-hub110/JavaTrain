package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAdd() {
        //given
        double a = 5;
        double b = 10;
        //when
        double result = Calculator.add(a, b);
        //then
        assertEquals(15, result);
    }

    @Test
    void shouldSubstract() {
        //given
        double a = 5;
        double b = 10;
        //when
        double result = Calculator.substract(a, b);
        //then
        assertEquals(-5, result);
    }

    @Test
    void shouldMultiply() {
        //given
        double a = 5;
        double b = 10;
        //when
        double result = Calculator.multiply(a, b);
        //then
        assertThat(result).isEqualTo(50);
    }

}
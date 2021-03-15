package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {



    @ParameterizedTest
    @CsvSource({
        "3, 7, 10",
        "0, 3, 3",
    })
    void add_behaves_as_expected(int a, int b, int expectedResult ) {
        int result = Sample.op(Sample.Operation.ADD,a, b);
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
    
    @Test
    void null_op_should_produce_an_exception() {
        int dividend = 10;
        int divisor = 0;

        Assertions.assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(() -> Sample.op(null,dividend, divisor));
    }

    @Test
    void dividing_10_by_2_should_produce_5() {
        int dividend = 10;
        int divisor = 2;

        int quotient = Sample.divide(dividend, divisor);

        Assertions.assertThat(quotient).as("quotient of 10 / 2")
            .isEqualTo(5);
    }



}

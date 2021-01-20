import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void factorialOf0is1(){
        // given
        int number = 0;

        // when
        int actual = Factorial.calculate(number);

        // then
        assertEquals(1,actual);
    }

    @Test
    public void factorialOf1is1(){
        // given
        int number = 1;

        // when
        int actual = Factorial.calculate(number);

        // then
        assertEquals(1,actual);
    }

    @Test
    public void factorialOf2is2(){
        // given
        int number = 2;

        // when
        int actual = Factorial.calculate(number);

        // then
        assertEquals(2,actual);
    }

    @Test
    public void factorialOf3is6(){
        // given
        int number = 3;

        // when
        int actual = Factorial.calculate(number);

        // then
        assertEquals(6,actual);
    }

}

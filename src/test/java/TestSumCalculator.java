import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSumCalculator {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrectForOne(){
        // when
        int actual = sumCalculator.sum(1);

        // Then
        int expected = 1;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testThatSumWorksCorrectForThree(){
        // when
        int actual = sumCalculator.sum(3);

        // Then
        int expected = 6;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testThatSumWorksCorrectForZero(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));

    }


}

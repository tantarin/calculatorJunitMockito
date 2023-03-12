import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @InjectMocks
    public Calculator calculator;

    @Mock
    public CalculatorService calculatorService;

    int x;
    int y;

    @Before
    public void setUp() {
        calculator = new Calculator(calculatorService);
        x = 2;
        y = 3;
    }

    @Test
    public void testAdd() {
        when(calculatorService.add(2,3)).thenReturn(5);

        int expectedResult = 5;
        Assert.assertEquals(expectedResult, calculator.sum(x, y));
    }

//    @Test(expected = ArithmeticException.class)
//    public void testDivizionByZero() {
//        int a = 15;
//        int b = 0;
//        calculator.divide(a, b);
//    }
}

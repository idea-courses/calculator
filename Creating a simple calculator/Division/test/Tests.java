import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Calculator calculator = new Calculator();
    double expected = 5;
    double actual = calculator.division(15, 3);
    Assert.assertEquals(expected, actual, 0.1);
  }
}
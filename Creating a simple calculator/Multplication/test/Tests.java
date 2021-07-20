import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Calculator calculator = new Calculator();
    int expected = 12;
    int actual = calculator.multiplication(4, 3);
    Assert.assertEquals(expected, actual);
  }
}
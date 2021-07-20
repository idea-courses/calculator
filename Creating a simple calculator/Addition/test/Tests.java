import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Calculator calculator = new Calculator();
    int expected = 6;
    int actual = calculator.addition(3, 3);
    Assert.assertEquals(expected, actual);
  }
}
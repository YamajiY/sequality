package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  public void testaverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(10, 4), 0.0);
  }

  public void testrageSum() {
    Calculate calculate = new Calculate();
    int expected = 10;
    assertEquals(expected, calculate.range_sum(1, 4));
  }

  public void testevenSum() {
    Calculate calculate = new Calculate();
    int expected = 20;
    assertEquals(expected, calculate.range_sum_even(2, 8));
  }

  public void testoddSum() {
    Calculate calculate = new Calculate();
    int expected = 15;
    assertEquals(expected, calculate.sum(2, 7));
  }
}

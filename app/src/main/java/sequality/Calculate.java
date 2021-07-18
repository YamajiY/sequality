package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int num, int devader) {
    return (double) num / devader;
  }

  public int range_sum(int x, int y) {
    int mysum = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      mysum = sum(mysum, i);
    }
    return mysum;
  }

  public int range_sum_even(int x, int y) {
    int even = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even = sum(even, i);
      }
    }
    return even;
  }

  public int range_sum_odd(int x, int y) {
    int odd = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 != 0) {
        odd = sum(odd, i);
      }
    }
    return odd;
  }

  public String getmess(int x, int y) {
    return "Sum of " + x + "and" + y + "is" + sum(x, y) + ". Average is " + average(x, y) + ".";
  }
}

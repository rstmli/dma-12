package bigunctiontask;

import java.util.function.BiFunction;

public class Calc {
  public int operation(int a, int b, BiFunction<Integer, Integer, Integer> function) {
    return function.apply(a, b);
  }

}

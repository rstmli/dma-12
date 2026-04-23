package staticandfinal;

public class Main {
  public static void main(String[] args) {

//    Car p1 = new Car("Ilkin","Eyyubov",21,3500.0);
//    Car p2 = new Car("Nurlan","Rahmanov",26,3590.00);
//    Car p3 = new Car("Murat","Shahbasov",25,4000.00);
//
//    Car.getTotalSalaryAndAvg();

    int[] arr = {1, 5, 23, 5, 6, 78, 3, 12, 4, 5, 7};
    int target = 15;

    System.out.println("Max: " + max(arr));
    System.out.println("sum: " + sum(arr));
    System.out.println("avg: " + avg(arr));
    System.out.println("target number: " + targetNumber(target, arr));
    evenPrint(arr);
  }


  // max
  public static int max(int[] arr) {
    int max = arr[0];
    for (int i : arr) {
      if (max < i) {
        max = i;
      }
    }
    return max;
  }

  // sum
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;

  }


  // avg
  public static double avg(int[] arr) {
    return (double) sum(arr) / arr.length;
  }


  // even

  public static int[] even(int[] arr) {
    int size = 0;
    for (int j : arr) {
      if (j % 2 == 0) {
        size++;
      }
    }
    int[] array = new int[size];

    int count = 0;
    for (int j : arr) {
      if (j % 2 == 0) {
        array[count++] = j;
      }
    }
    return array;
  }

  // target num

  public static boolean targetNumber(int target, int[] arr) {
    for (int i : arr) {
      if (target == i) {
        return true;
      }
    }
    return false;
  }

  public static void evenPrint(int[] arr){
    System.out.print("Cutler: ");
    for (int i : even(arr)) {
      System.out.print(i + " ");
    }
  }


}

public class Main {


  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 8, 12, 30, 15, 20};
//    int max = arr[0];


    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      if (arr[i] <= 1) {
        System.out.println("eded ne sade ne murekkebdir: " + arr[i]);
        continue;
      }
      for (int j = 2; j <= arr[i]; j++) {
        if (arr[i] % j == 0) {
          count++;
        }
      }
      if (count == 1) {
        System.out.println("sade: " + arr[i]);
      } else {
        System.out.println("murekkeb: " + arr[i]);
      }
    }
//    System.out.println(max);
  }
}

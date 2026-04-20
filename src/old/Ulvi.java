package old;

import java.util.Arrays;

public class Ulvi {
  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; // 1,2,3,4,5,6,7,4,5,6,7,8,9 , 1,2,3,
    int[] arr2 = {4, 5, 6, 7, 8, 9};
    int[] result = new int[arr1.length + arr2.length];

    for(int i = 0;i<arr1.length;i++){
        result[i]=arr1[i];
    }
    for(int i = 0;i<arr2.length;i++){
      result[arr1.length + i]=arr2[i];
    }

    int[] distinctArray = new int[result.length];

    for(int  i = 0;i<result.length;i++){
      int distinctCount = 0;
      for(int j = 0;j<i;j++){
        if(result[i]== result[j]){
          distinctCount++;

        }
      }
      if(distinctCount==1){
        System.out.println(result[i]);
      }
    }




    System.out.println(Arrays.toString(distinctArray));









//
//    for (int i = 0; i < arr1.length; i++) {
//      boolean found = false;
//      for (int j = 0; j < arr2.length; j++) {
//        if (arr1[i] == arr2[j]) {
//          found = true;
//          break;
//        }
//      }
//      if (!found) {
//        result[count] = arr1[i];
//        count++;
//      }
//    }
//    for (int i = 0; i < arr2.length; i++) {
//      boolean found = false;
//      for (int j = 0; j < arr1.length; j++) {
//
//        if (arr2[i] == arr1[j]) {
//          found = true;
//          break;
//        }
//
//      }
//      if (!found) {
//        result[count] = arr2[i];
//        count++;
//      }
//    }
//    count = 0;
//    for (int i = 0; i < result.length; i++) {
//      if (result[i] != 0) {
//        count++;
//      }
//    }
//    int[] fullArr = new int[count];
//    count = 0;
//    for (int i = 0; i < result.length; i++) {
//
//      if (result[i] != 0) {
//        fullArr[count] = result[i];
//        count++;
//      }
//    }
//    System.out.println(Arrays.toString(fullArr));

  }
}

//  System.arraycopy(arr1,0,result,0,arr1.length);
//  System.arraycopy(arr2,0,result,arr1.length,arr2.length);
//  int[] distinctArray = Arrays.stream(result).distinct().toArray();
//    System.out.println(Arrays.toString(distinctArray));


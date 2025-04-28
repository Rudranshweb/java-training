import java.util.Scanner;
public class traning {
  static int targetsum(int[] arr){
        int target=8;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==target){
            System.out.println(i);
          }
        }
        return -1;
  }
      public static void main(String[] args) {
      int [] arr={5,8,6,3,6,8};
      targetsum(arr);
    

    
    
    }
  }
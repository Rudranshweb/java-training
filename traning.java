import java.util.Scanner;
public class traning {
  //print even number a to n
    static void element(int a, int n){
      for(int i=a;i<=n;i=i+2){
        System.out.println(i);
      }
    }
      public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a =sc.nextInt();  
      int n =sc.nextInt();
      element(a,n);
  
    
    
    }
  }
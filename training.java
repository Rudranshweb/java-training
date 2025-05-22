import java.util.Scanner;

public class training{
  //exception handling according to user input
  public static void main(String[] args) {
    int [] arr={1,2,3,4};
    Scanner scanner=new Scanner(System.in);
    try {
      System.out.println(arr[scanner.nextInt()]);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("helloo");
    System.out.println("hiii");
}}
  

  

   
// import java.util.Scanner;

// public class training{
//   //exception handling according to user input
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str;
//       try {
//         String c=null;
//         str=sc.nextLine();
//      System.out.println(str.toUpperCase());
     
//     } catch (Exception e) {
//       System.out.println(e);
//     }
//     System.out.println("hello");
//     System.out.println("hiiiiiii");
//       }
      
//     }
import java.util.ArrayList;
public class training {

  public static void main(String[] args) {
    ArrayList<String> arr= new ArrayList<>();
    arr.add("rahul");
    arr.add("harsh");
    arr.add("karan");
    arr.add(1,"india");
    arr.set(3, "uk");
    arr.get(1);
    System.out.println(arr);
  }
}



  

   
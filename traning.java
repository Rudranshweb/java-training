import java.util.Scanner;
public class traning {
    static void bsort(String [] str){
      //int sum=0;
      for(int i=0;i<str.length-1;i++){
        for(int j=0;j<str.length-i-1;j++){
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
      }
    }
      public static void main(String[] args) {
      //Scanner sc= new Scanner(System.in);
      //int a =sc.nextInt();  
      //int n =sc.nextInt();
      String [] str={"B","A","D","C"};
      bsort(str);
      for(String s: str){
        System.out.print(s +" ");
      }
      
    
    
    }
  }
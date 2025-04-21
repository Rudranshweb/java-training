import java.util.Scanner;
public class traning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the valuesssssssssssssssss");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array isss");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
        System.out.println("the reverse is ");
        for(int k=arr.length-1;k<=arr.length;k++){
            System.out.print(arr[k]);
        }



    }
}
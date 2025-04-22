import java.util.Scanner;
public class traning {
    public static void main(String[] args) {
        int sum=123;
        if(sum%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        int [] arr = {1,3,4,6};
        int [] arr1 ={9,10,11,13};
        int [] arr2= new int[arr.length+arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];        
    }
    for(int j=0;j<arr1.length;j++){
         arr2[arr.length+j]=arr1[j];

    }
    for(int k=0;k<arr2.length;k++){
        System.out.println(arr2[k]);
    }

    String str="hello";
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i));
    }
    System.out.println();
    String rev="";
    for(int j=str.length()-1;j>=0;j--){
      rev+=str.charAt(j);
    }
    System.out.println(rev);
    if(str.equals(rev)){
        System.out.println("it is palendrome");
    }
    else{
        System.out.println("not a palandrome");
    }

    }
}

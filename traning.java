import java.util.Scanner;
public class traning {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        int sum=0;
            for(int k=0;k<arr.length;k++){
                for(int j=0;j<arr[k].length;j++){
                    sum+=arr[k][j];
                }
                System.out.println("sum of the row"+ k+":"+sum);
                sum=0;
            }
        int product=1;
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length;j++){
                product*=arr[k][j];
            }
            System.out.println("multi of the row"+ k+":"+product);
            product=1;
        }
    
        System.out.println("2D array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // Find min and max
        int min= arr[0][0];
        int max = arr[0][0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                count++;
            }
        }
        System.out.println("Minimum value in 2D array: " + min);
        System.out.println("Maximum value in 2D array: " + max);
        System.out.println("Total number of elements in 2D array: " + count);

        // Convert 2D array to 1D array
        int[] oneDArray = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                oneDArray[index++] = arr[i][j];
            }
        }
        System.out.println("1D array elements:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();
    }
}


   
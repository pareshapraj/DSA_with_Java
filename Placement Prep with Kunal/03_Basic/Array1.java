import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // int[] arr=new int [5];

        // int[] arr1={1,2,3,4,5};

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;

        // //Three ways to Print Array

        // for(int i=0;i<arr.length;i++){      //first way
        //     System.out.print(arr[i]+" ");
        // }

        // for(int i:arr1){                    //second way
        //     System.out.println();
        //     System.out.print(i+" ");
        // }

        // System.out.println();
        // System.out.println(Arrays.toString(arr));   //third way



        //Two Dimentional Array

        int[][] arr=new int[3][3];       //Colume Specification is not manditory in java
        
        int [][] arr2={
            {1,2,3},
            {4,5},
            {6,7,8}
        };

        for(int i=0;i<arr2.length;i++){     //printing 2d array first method 
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //  for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }


        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        sc.close();
    }
    
}

import java.util.Arrays;

// look at carefully at this matrix this matrix is not properly sorted in only row it is sorted then this logic is
// devloped for serching item in the array
public class unsortedSearch {
    public static void main(String args[]){
        int [][] arr={
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 58}
        };

        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int [][] matrix, int target){
        int r=0;
        int c= matrix.length-1;

        while(r <matrix.length && c>=0){
            
            if(matrix[r][c]==target){
                return new int []{r,c};
            }
            if(matrix[r][c]< target){
            r++;
            }
            else{
            c--;
            }
        }
        return new int[]{-1,-1};
    }
}

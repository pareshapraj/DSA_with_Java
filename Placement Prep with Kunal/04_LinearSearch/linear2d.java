import java.util.Arrays;

public class linear2d {
    public static void main(String[] args) {
        int [][] arr={
            {1,5,6},
            {8,4,7,3},
            {2,4}
        };

        int target=7;

        int[] ans= searchTwo(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchTwo(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int [] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
}

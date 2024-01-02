//code for selection sort algorithm
import java.util.*;

public class practice {
    public static void main(String args[]){
        // int arr[]={4,5,1,2,3};
        int arr[] = {5,4,3,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int [] arr){
        for(int i=0;i<arr.length;i++){

            int last = arr.length - i -1;
            int maxIndex = getMaxValue(arr,0,last);

            swap(arr, maxIndex,last);
        }
    }

    private static void swap(int arr[],int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int getMaxValue(int [] arr, int start , int end){
        int max= start;

        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }

}

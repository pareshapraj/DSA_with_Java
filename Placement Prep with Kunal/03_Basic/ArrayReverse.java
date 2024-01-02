import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        
          reverse(arr,0,4);
    }

    static void reverse(int[] arr, int i,int j ){
        int start=i;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int s, int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}

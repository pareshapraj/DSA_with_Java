import java.util.*;

public class Practice {
    public static void main(String args[]){
        // int arr[]={3,1,5,4,2};
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){

        for(int i=0;i<arr.length;i++){

            boolean swap=false;
            for(int j=1; j<arr.length-i;j++){

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swap=true;
                }
            }

            if(!swap){
                break;
            }
        }
    }
}

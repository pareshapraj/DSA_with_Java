import java.util.Arrays;

class insertion{
    public static void main(String args[]){
        int arr[]= {4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int [] arr){

        // i starts form 0 and ends at n-2 becase the n-2 is we need next elelment j for initialization and -1 is the arrays last index
        for(int i=0; i<arr.length-1;i++){

            for(int j=i+1;j>0;j--){

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    //if j is not smaller than left element then left hand all elements already sorted then break the condition
                    break;
                }
            }
        }
    }

    //this function is for swapping the maximum element and the last current element in the array
    static void swap(int [] arr, int first , int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
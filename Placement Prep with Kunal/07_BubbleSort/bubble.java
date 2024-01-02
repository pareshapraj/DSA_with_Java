import java.util.Arrays;

class bubble{
    public static void main(String args[]){
        int arr[]={3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            //for each step , max item will come at the last respective index

            boolean swap= false;

            for(int j=1;j< arr.length-i;j++){

                if(arr[j] < arr[j-1]){

                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swap=true;
                }
            }

            // if you did not swap for particular value of i, it means the array is sorted hence stop the program 
            if(!swap){
                break;
            }
        }
    }
}
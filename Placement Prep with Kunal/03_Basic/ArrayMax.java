public class ArrayMax {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,3};

        Max(arr);

    }
    static void Max(int [] arr){
        int max=arr[0];

        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("Maximum number in array is "+ max);
    }
}

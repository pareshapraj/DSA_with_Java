//This if program for if element found at the array then return the array
//else if element is not present at the array then return the largest smallest number near the target

public class floor_of_num {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8};
        int target=6;

        int ans=floorNum(arr, target);
        System.out.println(arr[ans]);
    }

    static int floorNum(int [] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }

        //all the code is same only last return statement is changed
        return end;
    }

}

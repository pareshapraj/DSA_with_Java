 //This program is for finding and element if available then return element AND if not available then return next bigger nuber of the element
public class Celing_of_number {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,9};
        int target=8;

        int ans=celing(arr,target);
        System.out.println(arr[ans]);
    }

    static int celing(int [] arr, int target){
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

        //All Code Same to Same like simple binary code only the RETURN START ;     statement added ;
        return start;
    }
}

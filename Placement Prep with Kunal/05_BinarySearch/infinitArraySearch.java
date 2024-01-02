public class infinitArraySearch {
    public static void main(String args[]){

        //lets assume this is the infinite array 
        int[] infinit={3,5,7,9,10,90,100,130,140,160,170};
        int target =10;
         System.out.println(ans(infinit,target));
    }

    static int ans(int [] arr, int target){

        // we dont have the end of the array then we are taking chunk of the array 
        // we are taking the short short boxes of the array firest box is 0 to 1 size is 2
        int start=0;
        int end=1;

        //finding the perfext box that searchable item lies between that box
        
        while(target>arr[end]){
            int temp= end+1;

            // to find the temp end DOBLE THA SIZE OF THE BOX
            // end= privous end + sizeofbox *2 
            end=end+(end-start+1)*2;
            start=temp;
        }

        // now the perfect start and end geeted for the target value box
        // providing the start and end of to the binary searh method then we get the elemnt
        return binarySearh(arr, target, start, end);
    } 
    static int binarySearh(int [] arr, int target, int start, int end){
        
        while(start<=end){
            int mid=(start + end)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

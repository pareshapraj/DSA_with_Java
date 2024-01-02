public class linearSearch2 {

    public static void main(String[] args) {
        int [] nums={12,42,63,634,75,74,23};

        int target=75;

        boolean ans= linearSearch22(nums,target);

        System.out.println(ans);

    }

    static int linearSearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            
        }
        return -1;
    }


    static boolean linearSearch22(int[] nums,int target){
        if(nums.length==0){
            return false;
        }

        for(int element: nums){
            if(element==target){
                return true;
            }
            
        }
        return false;
    }

}

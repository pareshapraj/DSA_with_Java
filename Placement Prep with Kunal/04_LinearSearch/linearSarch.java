
//Simple Linear Search program in Java
public class linearSarch {
    public static void main(String[] args) {
        int [] nums={12,42,63,634,75,74,23};

        int target=75;

        int ans= linearSearch(nums,target);

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
}

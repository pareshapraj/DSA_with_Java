public class linearMin {
    public static void main(String[] args) {
        int [] nums={12,42,63,634,75,741,3,23};

        int ans= minsearch(nums);

        System.out.println(ans);

    }

    static int minsearch(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int ans= nums[0];
        for(int i=1;i<nums.length;i++){
            if(ans > nums[i]){
                ans=nums[i];
            }
            
        }
        return ans;
    }
}


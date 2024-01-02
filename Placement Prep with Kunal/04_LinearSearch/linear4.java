public class linear4 {
    public static void main(String[] args) {
        int [] nums={12,42,63,634,75,74,23};
        int start=2;
        int end=4;
        int target=634;

        int ans= linearSearch(nums,target,start,end);

        System.out.println(ans);

    }

    static int linearSearch(int[] nums,int target,int start,int end){
        if(nums.length==0){
            return -1;
        }

        for(int i=start;i<end;i++){
            if(nums[i]==target){
                return i;
            }
            
        }
        return -1;
    }
}

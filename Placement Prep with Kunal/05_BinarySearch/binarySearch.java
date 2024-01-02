//Order agnostic Binary Search
public class binarySearch {
        public static void main(String [] args){
           //int [] nums={1,2,3,4,5,6,7,8,9};

           int [] nums={7,6,5,4,3,2,1};
           int target=7;
    
           int ans=binarySearch1(nums,target);
           System.out.println(ans);
        }
    
        static int binarySearch1(int []arr, int target){
            int start=0;
            int end=arr.length-1;
            
            while(start<=end){
                //int mid=(start+end)/2;
                if(arr[start]<arr[end]){
                    int mid=start + (end-start) /2;
                    
                    if(target>arr[mid]){
                        start= mid+1;
                    }
                    else if(target<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        return mid;
                    }
                }
                else{
                    int mid=start + (end-start) /2;
                    
                    if(target<arr[mid]){
                        start= mid+1;
                    }
                    else if(target>arr[mid]){
                        end=mid-1;
                    }
                    else{
                        return mid;
                    }
                }
            }
            return -1;
        
        }
    }

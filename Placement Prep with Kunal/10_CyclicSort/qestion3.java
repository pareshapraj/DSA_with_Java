//https://leetcode.com/problems/find-the-duplicate-number/description/

public class qestion3 {
    public static void main(String[] args) {
        
    }

    
    class Solution {
        public int findDuplicate(int [] arr){
             int i=0;
             while (i<arr.length) {

                if(arr[i] != i+1){
                    int correct= arr[i];
     
                    if(arr[i] != arr[correct]){
                        swap(arr,i, correct);
                    }
                    else{
                        return arr[i];
                    }
                }else{
                    i++;
                } 
             }
        }
     
             void swap(int [] arr, int first, int second){
                 int temp= arr[first];
                 arr[first] = arr[second];
                 arr[second] = temp;
             }
        
     }
     
     
}

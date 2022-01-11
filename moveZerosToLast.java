class Solution {
    public void moveZerosToLast(int[] nums) {
       int temp;
        for(int i=0,j=0;j< nums.length;j++){
           if(nums[j]!=0 ){
               temp=nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
               i++;
           }
       }
    }
}

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

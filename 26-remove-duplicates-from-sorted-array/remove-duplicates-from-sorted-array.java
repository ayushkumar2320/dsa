class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            int j;
            for( j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    break;
                }
            }
            if(j==i){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
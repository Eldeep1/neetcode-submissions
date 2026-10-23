class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroesCount = 0;
        for(int num : nums){
            if(num == 0){
                zeroesCount++;
                continue;
            }
            product = product * num;
        }
        int[] result = new int[nums.length];

        if(zeroesCount==0){
            for(int i=0; i< nums.length; i++){
                result[i] = product/nums[i];
            }
        }
        else if(zeroesCount==1){
            for(int i=0; i< nums.length; i++){
                if(nums[i]==0){
                    result[i] = product;
                    continue;
                }
                result[i] = 0;
            }
        }
        else{//more than one zero
            for(int i=0; i<nums.length;i++){
                result[i]=0;
            }
        }
        
        return result;
    }
}  

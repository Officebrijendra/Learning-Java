public class pivotIndex {

    public int pivotIndex(int[], nums){
        int sum = 0; leftsum = 0;
        for(int x: nums) sum = sum + X;
        for(int i = 0; i<nums.length; i++){
            if(leftsum == sum - leftsum - nums[i])
            return i;
            leftsum = leftsum + nums[i];

        }
        return -1;
    }
    
}
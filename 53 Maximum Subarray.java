class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        
        int temp_sum = Integer.MIN_VALUE;
        int sum = 0;
 
        for (int i = 0; i < size; i++)
        {
            sum = sum + nums[i];    //2nd element
            if (temp_sum < sum)         //comparison of 1st and 2nd
                temp_sum = sum;
            if (sum < 0)
                sum = 0;
        }
        return temp_sum;
    }
}


python:


class Solution:
	def maxSubArray(self, nums: List[int]) -> int:
		maxSub  = nums[0]
		curSum = 0
		
		for n in nums:
			if curSum < 0
				curSum = 0
			curSum  = curSum + n
			maxSub = max(maxSum, curSum)
		return maxSub










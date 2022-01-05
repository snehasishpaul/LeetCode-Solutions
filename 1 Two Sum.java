class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int arr[] = new int[2];
        
        for(int i=0 ; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}

// hashmap solution

public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();
        
        for(int i=0 ; i<nums.length ;i++){
            int complement = target - nums[i];
            
            if(map1.containsKey(complement)){
                return new int[]{map1.get(complement),i};
            }
            
            map1.put(nums[i],i);
        }
        
        return nums;
}
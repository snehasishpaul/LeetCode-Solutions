class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2; 
        
        int arr[] = new int[len];
        int j=0;
        
        for(int i=0; i<len; i++){
            if(j == nums.length)	//new_arr[i] = nums[i%nums.length];
                j=0;
            arr[i] = nums[j];
            j++;
        }
        
        return arr;
    }
}
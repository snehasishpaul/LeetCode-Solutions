class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
                       
        HashSet<Integer> set = new HashSet<Integer>();
        
        int i=0, j=0, k=0;       

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<length1 && j<length2) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                set.add(nums1[i++]);
                j++;
            }
        }
        
        int[] ans = new int[set.size()];
        
        for(Integer ele: set)
            ans[k++] = ele;
        
        return ans;
    }
}
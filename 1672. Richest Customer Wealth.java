class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxSum = 0;
        
        for(int i=0; i<accounts.length; i++) {
            for(int j=0; j<accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            
            if(sum > maxSum)
                maxSum = sum;
            
            sum = 0;
        }
             
        return maxSum;
                
    }
}



python

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        sum = 0
        maxSum = 0
        
        for mat1 in accounts:
            for element in mat1:
                sum = sum + element
                
            if sum > maxSum:
                maxSum = sum
                
            sum = 0
                
        return maxSum
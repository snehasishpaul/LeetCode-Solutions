class Solution {
    public boolean isHappy(int n) {
        
        int dig, sum=0;
        while(true) {
            
            if(n == 0 || n == 2 || n == 3 || n == 4)
                break;  
            
            sum = 0;
            while(n>0) {
                dig = n%10;
                sum = sum + (dig*dig);
                n = n/10;
            }
            
            if(sum == 1) {
                return true;
            }
            
            n = sum;           
                                 
        }
        
        return false;
        
    }
}
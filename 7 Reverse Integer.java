import java.lang.*;
class Solution {
    public int reverse(int x) {
        
        long c = java.lang.Integer.MAX_VALUE;
        
        int temp = x;
        int dig;
        long revsum=0;
        
        if(x<0) {
            x = -x;
            while(x>0) {
                dig = x%10;
                revsum = (revsum * 10) + dig;
                if (revsum  > c || revsum < -c)
                    return 0;
                x = x/10;
            }
            revsum = revsum * (-1);
            return (int)revsum;
        } 
        else {
            while(x>0) {
                dig = x%10;
                revsum = (revsum * 10) + dig;
                if (revsum  > c || revsum < -c)
                    return 0;
                x = x/10;
            }
            
            return (int)revsum;
        }
        
    }
}
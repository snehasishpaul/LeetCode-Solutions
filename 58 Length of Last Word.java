class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;
        //int c=1;
        
        for(int i=s.length() - 1; i>=0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
             }
            else if(s.charAt(i) == ' ') {
                if(count > 0) {
                    return count;
                }
                else
                    continue;
            }          
        }
        
        return count;
    }
}


or


class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        String w=words[words.length-1];
        return w.length();
        
    } 
}
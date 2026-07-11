import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {

        

        String str = Integer.toString(x);
        String revstr = new StringBuilder(str).reverse().toString();

        if(str.equals(revstr))
        {
            return true;
        }
        return false;
        
    
    }
}
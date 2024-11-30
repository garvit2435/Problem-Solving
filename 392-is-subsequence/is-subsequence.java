class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0, ptr2 = 0, count = 0;
        if(s.length() == 0) return true;
        while(ptr2 <= t.length() - 1 ){
            if(count == s.length())
            return true;
            if(s.charAt(ptr1) == t.charAt(ptr2)){
                ptr1++;
                ptr2++;
                count++;
            }
            else{
                ptr2++;
            }
        }
        if(count == s.length())
            return true;
        return false;
        // ptr1 = s.charAt()
    }
}
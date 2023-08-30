/*class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split the string into words
        
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}*/
class Solution {
    public static String reverseWords(String s) {
        char[] a = s.toCharArray();
        char[] res = new char[a.length];
        int i = a.length - 1, j, k, r = 0;

        while (i >= 0 && a[i] == ' ') i--;

        while (i >= 0) {
            j = i; // end word

            while (i >= 0 && a[i] != ' ') i--; // find end
            if (r > 0) res[r++] = ' ';  // add ' ' to res[]

            // reverse word and copy
            for (k = i + 1; k <= j; k++) res[r++] = a[k];  

            // clear excess space
            while (i >= 0 && a[i] == ' ') i--; 
        }
        return new String(res, 0, r);
    }
}

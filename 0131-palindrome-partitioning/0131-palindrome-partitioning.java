class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        rec(0,s,ans,list);
        return ans;

    }
    void rec(int ind, String s, List<List<String>> ans, List<String> list){
        if(ind==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind; i<s.length(); i++){
            if(isPalindrome(s, ind, i)){
                list.add(s.substring(ind, i+1));
                rec(i+1, s, ans, list);
                list.remove(list.size()-1);
            }

        }

    }
    boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
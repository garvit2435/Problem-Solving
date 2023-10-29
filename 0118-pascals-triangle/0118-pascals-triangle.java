class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int res=1;
        List<Integer> temp=new ArrayList<Integer>();
        temp.add(1);
        ans.add(new ArrayList<>(temp));

        for(int i=2;i<=n;i++){
            List<Integer> list=new ArrayList<Integer>();
            list.add(1);
            for(int j=1;j<i;j++){
                res=res*(i-j)/j;
                list.add(res);
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}
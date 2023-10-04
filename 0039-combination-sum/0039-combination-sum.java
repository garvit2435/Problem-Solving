class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        fun(0, target, new ArrayList<Integer>(), candidates, ans);
        return ans;

    }
    public void fun(int ind, int target, List<Integer> ds, int[] candidates, List<List<Integer>> ans ){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        if(target>=candidates[ind]){
            ds.add(candidates[ind]);
            fun(ind, target-candidates[ind], ds, candidates, ans);
            ds.remove(ds.size()-1);
        }
        fun(ind+1, target, ds, candidates, ans);
    }
    
}
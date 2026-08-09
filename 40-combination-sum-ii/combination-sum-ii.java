class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void combinations(List<Integer> comb,int[] candidates,int target,int start){
        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            comb.add(candidates[i]);
            combinations(comb,candidates,target - candidates[i],i+1);
            comb.remove(comb.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> comb = new ArrayList<>();
        combinations(comb,candidates,target,0);
        return ans;
    }
}
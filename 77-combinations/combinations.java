class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void recursion(List<Integer> comb,int n,int k,int start,int count){
        if(count == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start;i<=n;i++){
            comb.add(i);
            recursion(comb,n,k,i+1,count+1);
            comb.remove(comb.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> comb = new ArrayList<>();
        recursion(comb,n,k,1,0);
        return ans;
    }
}
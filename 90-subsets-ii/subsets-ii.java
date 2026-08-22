class Solution {
    public void recursion(int[] nums,int start,List<Integer> temp,HashSet<List<Integer>> set){
        set.add(new ArrayList<>(temp));
        if(start == nums.length){
            return;
        }
        recursion(nums,start+1,temp,set);
        temp.add(nums[start]);
        recursion(nums,start+1,temp,set);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        recursion(nums,0,temp,set);
        for(List<Integer> l : set){
            ans.add(l);
        }
        return ans;
    }
}
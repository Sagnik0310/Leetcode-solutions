class Solution {
    public void helper(int[] nums, List<Integer> temp, boolean[] used,List<List<Integer>> res){
        
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            
            if(used[i]) continue;

            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            temp.add(nums[i]);
            used[i] = true;
            helper(nums, temp, used, res);;
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(nums, temp, used, ans);;
        return ans;
    }
}
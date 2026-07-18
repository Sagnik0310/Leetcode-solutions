class Solution {
    public boolean compare(String a,String b,String target){
        if(a.length()+b.length() != target.length()) return false;
        return target.equals(a+b);
    }
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(i != j && compare(nums[i],nums[j],target)) count++;
            }
        }
        return count;
    }
}
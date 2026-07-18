class Solution {
    public boolean isArithmatic(int[] nums,int x,int y){
        int[] copy = new int[y-x+1];
        int idx = 0;
        for(int i = x;i<=y;i++){
            copy[idx++] = nums[i];
        }
        Arrays.sort(copy);
        int diff = copy[1] - copy[0];
        for(int i = 1;i<copy.length-1;i++){
            if(diff != copy[i+1]-copy[i]) return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> temp = new ArrayList<>();
        for(int i = 0;i<l.length;i++){
            temp.add(isArithmatic(nums,l[i],r[i]));
        }
        return temp;
    }
}
class Solution {
    public int gcd(int a,int b){
        int ans = 1;
        for(int i = 1;i<=a;i++){
            if((b%i == 0)&&(a%i == 0)) ans = i;
        }
        return ans;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return gcd(min,max);
    }
}
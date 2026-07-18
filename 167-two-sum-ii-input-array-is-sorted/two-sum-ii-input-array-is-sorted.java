class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int small = 0;
        int large = numbers.length-1;
        int[] ans = new int[2];
        while(small<large){
            int a = numbers[small];
            int b = numbers[large];
            if(a + b == target){
                ans[0] = small+1;
                ans[1] = large+1;
                return ans;
            }
            else if(a+b>target) large--;
            else small++;
        }
        return ans;
    }
}
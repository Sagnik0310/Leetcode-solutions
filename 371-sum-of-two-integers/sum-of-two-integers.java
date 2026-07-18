class Solution {
    public int getSum(int a, int b) {
        int carry = (a&b)<<1;
        int sum = a^b;
        while(carry != 0){
            a = sum;
            b =  carry;
            carry = (a&b)<<1;
            sum = a^b;
        }
        return sum;
    }
}
class Solution {
    public int factorial(int n){
        int fact = 1;
        while(n>0){
            fact = fact*n;
            n = n-1;
        }
        return fact;
    }
    public String getPermutation(int n, int k) {
        List<Integer> l = new ArrayList<>();
        StringBuilder ans = new StringBuilder("");
        for(int i = 1;i<=n;i++){
            l.add(i);
        }
        int m = n;
        while(m>0){
            int fact = factorial(m-1);
            int index = (k-1)/(fact);
            k = (k-1)%fact + 1;
            m = m-1;
            ans.append(l.get(index));
            l.remove(index);
        }
        return ans.toString();
    }
}
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            if(!map.containsKey(curr)){
                map.put(curr,1);
            }
            else{
                map.put(curr,map.get(curr)+1);
            }
        }
        int ans = 0;
        boolean flag = false;
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()%2 != 0) flag = true;
            ans = ans + (e.getValue()/2)*2;
        }
        if(flag) ans = ans+1;
        return ans;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!map.containsKey(a)){
                if(map.containsValue(b)) return false;
                map.put(a,b);
            }
            else{
                if(map.get(a) != b) return false;
            }
        }
        return true;
    }
}
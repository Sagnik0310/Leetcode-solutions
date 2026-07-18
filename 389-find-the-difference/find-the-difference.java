class Solution {
    public char findTheDifference(String s, String t) {
        int[] map = new int[26];
        for(int i = 0;i<s.length();i++){
            map[s.charAt(i)-'a'] = map[s.charAt(i)-'a'] + 1;
        }
        for(int i = 0;i<t.length();i++){
            map[t.charAt(i)-'a'] = map[t.charAt(i)-'a'] - 1;
        }
        for(int i = 0;i<26;i++){
            if(map[i] == -1){
                return (char)('a'+i);
            }
        }
        return ' ';
    }
}
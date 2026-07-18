class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for(int i = 0;i<magazine.length();i++){
            map[magazine.charAt(i)-'a'] = map[magazine.charAt(i)-'a'] + 1;
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(map[ransomNote.charAt(i)-'a'] == 0) return false;
            else{
                map[ransomNote.charAt(i)-'a'] = map[ransomNote.charAt(i)-'a'] -1;
            }
        }
        return true;
    }
}
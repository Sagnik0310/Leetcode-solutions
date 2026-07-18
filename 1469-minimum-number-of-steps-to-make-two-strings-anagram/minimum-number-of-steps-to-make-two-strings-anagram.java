class Solution {
    public int minSteps(String s, String t) {
        int count = 0;
        int[] freq_t = new int[26];
        for(char c : t.toCharArray()){
            int idx = c - 'a';
            freq_t[idx] = freq_t[idx] + 1;
        }
        int[] freq_s = new int[26];
        for(char c : s.toCharArray()){
            int idx = c - 'a';
            freq_s[idx] = freq_s[idx] + 1;
        }
        for(int i = 0;i<freq_t.length;i++){
            count = count + Math.max(freq_s[i] - freq_t[i],0);
        }
        return count;
    }
}
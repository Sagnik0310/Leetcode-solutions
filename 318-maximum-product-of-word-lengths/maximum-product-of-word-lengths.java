class Solution {
    public boolean checker(String a,String b){
        int mask1 = 0;
        int mask2 = 0;
        for(int i = 0;i<a.length();i++){
            mask1 = mask1 | (1<<(a.charAt(i)-'a'));
        }
        for(int i = 0;i<b.length();i++){
            mask2 = mask2 | (1<<(b.charAt(i)-'a'));
        }
        return (mask1 & mask2) == 0;
    }
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0;i<words.length-1;i++){
            String a = words[i];
            for(int j = i+1;j<words.length;j++){
                String b = words[j];
                if(checker(a,b)) max = Math.max(a.length()*b.length(),max);
            }
        }
        return max;
    }
}
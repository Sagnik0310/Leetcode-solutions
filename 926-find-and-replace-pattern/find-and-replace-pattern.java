class Solution {
    public boolean isPattern(String word,String pattern){
    HashMap<Character,Character> map = new HashMap<>();
    HashSet<Character> used = new HashSet<>();

    for(int i = 0;i<word.length();i++){
        char p = pattern.charAt(i);
        char w = word.charAt(i);

        if(!map.containsKey(p)){
            if(used.contains(w)) return false;
            map.put(p,w);
            used.add(w);
        }
        else{
            if(map.get(p) != w) return false;
        }
    }
    return true;
}
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(isPattern(words[i],pattern)) l.add(words[i]);
        }
        return l;
    }
}
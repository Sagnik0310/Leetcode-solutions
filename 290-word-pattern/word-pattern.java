class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
    
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                map.put(c, word);
            }

            if (reverse.containsKey(word)) {
                if (reverse.get(word) != c) return false;
            } else {
                reverse.put(word, c);
            }
        }

        return true;
    }
}
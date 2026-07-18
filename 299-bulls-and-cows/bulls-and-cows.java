class Solution {
    public String getHint(String secret, String guess) {
    int b = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < secret.length(); i++) {
        if (secret.charAt(i) == guess.charAt(i)) {
            b++;
        } else {
            map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
        }
    }

    int c = 0;

    for (int i = 0; i < secret.length(); i++) {
        if (secret.charAt(i) != guess.charAt(i)) {
            char g = guess.charAt(i);
            if (map.containsKey(g) && map.get(g) > 0) {
                c++;
                map.put(g, map.get(g) - 1);
            }
        }
    }

    return b + "A" + c + "B";
}
}
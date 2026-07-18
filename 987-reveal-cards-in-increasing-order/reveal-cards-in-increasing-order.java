class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = deck.length - 1; i >= 0; i--) {

        if (!l.isEmpty()) {
            int last = l.remove(l.size() - 1);
            l.add(0, last);
        }

        l.add(0, deck[i]);
}

        int[] ans = new int[l.size()];
        for(int i = 0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}
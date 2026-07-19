class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] copy = new int[score.length];
        for(int i = 0;i<score.length;i++){
            copy[i] = score[i];
        }
        Arrays.sort(copy);
        int n = score.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<score.length;i++){
            map.put(copy[i],n-i);
        }
        String[] ans = new String[score.length];
        for(int i = 0;i<score.length;i++){
            int curr = map.get(score[i]);
            if(curr == 1){
                ans[i] = "Gold Medal";
                continue;
            }
            if(curr == 2){
                ans[i] = "Silver Medal";
                continue;
            }
            if(curr == 3){
                ans[i] = "Bronze Medal";
                continue;
            }
            ans[i] = Integer.toString(curr);
        }
        return ans;
    }
}
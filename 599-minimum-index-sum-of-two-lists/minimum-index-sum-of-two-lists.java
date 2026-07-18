class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        ArrayList<String> ans = new ArrayList<>();
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int currSum = i + map.get(list2[i]);

                if(sum > currSum){
                    sum = currSum;
                    ans.clear();
                    ans.add(list2[i]);
                }
                else if(sum == currSum){
                    ans.add(list2[i]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}
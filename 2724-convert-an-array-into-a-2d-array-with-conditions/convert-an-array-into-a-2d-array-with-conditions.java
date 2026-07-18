class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(!map.containsKey(x)) map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        int n = Collections.max(map.values());
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(e.getValue()>0){
                    temp.add(e.getKey());
                    e.setValue(e.getValue()-1);
                }
            }
            l.add(temp);
        }
        return l;
    }
}
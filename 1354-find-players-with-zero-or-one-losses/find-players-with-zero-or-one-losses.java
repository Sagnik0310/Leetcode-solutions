class Solution { 
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<matches.length;i++){
            if(!map.containsKey(matches[i][1])) map.put(matches[i][1],1);
            else{
                map.put(matches[i][1],map.get(matches[i][1])+1);
            }
        }

        List<Integer> l1 = new ArrayList<>();
        HashSet<Integer> added = new HashSet<>();

        for(int i = 0;i<matches.length;i++){
            int curr = matches[i][0];
            if(!map.containsKey(curr) && !added.contains(curr)){
                l1.add(curr);
                added.add(curr);
            }
        }

        List<Integer> l2 = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1) l2.add(e.getKey());
        }

        Collections.sort(l1);
        Collections.sort(l2);

        List<List<Integer>> l = new ArrayList<>();
        l.add(l1);
        l.add(l2);

        return l;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)) map.put(i,1);
            else{
                map.put(i,map.get(i)+1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int key : map.keySet()) {
            heap.offer(new int[]{key, map.get(key)});
            
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll()[0];
        }

        return result;
    }
}
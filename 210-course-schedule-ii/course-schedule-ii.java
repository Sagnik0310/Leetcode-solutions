class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegrees = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edges : prerequisites){
            int from = edges[1];
            int to = edges[0];
            adj.get(from).add(to);
            indegrees[to]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<numCourses;i++){
            if(indegrees[i] == 0){
                q.offer(i);
            }
        }
        int[] topoOrder = new int[numCourses];
        int index = 0;
        while(! q.isEmpty()){
            int current = q.poll();
            topoOrder[index++] = current;
            for(int neighbor : adj.get(current)){
                indegrees[neighbor]--;
                if(indegrees[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
        }
        if(index != numCourses){
            return new int[0];
        }
        return topoOrder;
    }
}
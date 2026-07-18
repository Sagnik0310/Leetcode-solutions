class Solution {
    public int convert(String s){
        String[] parts = s.split(":");
        int ans = Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]);
        return ans;
    }
    public int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        for(int i = 0;i<timePoints.size();i++){
            arr[i] = convert(timePoints.get(i));
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        min = Math.min(min, 1440 - arr[arr.length - 1] + arr[0]);
        return min;
    }
}
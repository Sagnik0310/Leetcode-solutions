class Solution {
    public int search(int[] heaters,int num){
        int low = 0;
        int high = heaters.length;
        while(low<high){
            int mid = low + (high-low)/2;
            if(heaters[mid]<num){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans = 0;
        for(int i = 0;i<houses.length;i++){
            int index = search(heaters,houses[i]);
            if(index == 0){
                ans = Math.max(ans,-houses[i] + heaters[index]);
            }
            else if(index == heaters.length){
                ans = Math.max(ans,houses[i]-heaters[index-1]);
            }
            else{
                int leftDistance  = houses[i] - heaters[index - 1];  
                int rightDistance = heaters[index] - houses[i]; 
                int nearest = Math.min(leftDistance, rightDistance);
                ans = Math.max(nearest,ans);
            }
        }
        return ans;
    }
}
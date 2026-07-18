class Solution {
    public List<String> buildArray(int[] target, int n) {
        int curr = 0;
        List<String> l = new ArrayList<>();
        for(int i = 1;curr<target.length && i<=n;i++){
            l.add("Push");
            if(target[curr] == i){
                curr++;
            }
            else{
                l.add("Pop");
            }
        }
        return l;
    }
}
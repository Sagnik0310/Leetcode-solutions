class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i : nums){
            if(i<pivot) l1.add(i);
            else if(i>pivot) l2.add(i);
            else if(i == pivot) l3.add(i);
        }
        l1.addAll(l3);
        l1.addAll(l2);
        int[] ans = new int[l1.size()];
        for(int i = 0;i<l1.size();i++){
            ans[i] = l1.get(i);
        }
        return ans;
    }
}
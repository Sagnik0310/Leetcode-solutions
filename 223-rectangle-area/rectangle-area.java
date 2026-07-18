class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a = (ax2-ax1)*(ay2-ay1);
        int b = (bx2-bx1)*(by2-by1);
        int total = a+b;
        if(Math.min(ax2,bx2)>Math.max(ax1,bx1) && Math.min(by2,ay2)>Math.max(by1,ay1)){
            int intersection = (Math.min(ax2,bx2)-Math.max(ax1,bx1))*(Math.min(by2,ay2)-Math.max(by1,ay1));
            total = total - intersection;
        }
        return total;
    }
}
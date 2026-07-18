class Solution {
    public void reverse(int[][] image,int row){
        int start = 0;;
        int end = image[0].length-1;
        while(start<end){
            int temp = image[row][start];
            image[row][start] = image[row][end];
            image[row][end] = temp;
            start++;
            end--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image.length;i++){
            reverse(image,i);
        }
        for(int i = 0;i<image.length;i++){
            for(int j = 0;j<image[0].length;j++){
                if(image[i][j] == 1) image[i][j] = 0;
                else image[i][j] = 1;
            }
        }
        return image;
    }
}
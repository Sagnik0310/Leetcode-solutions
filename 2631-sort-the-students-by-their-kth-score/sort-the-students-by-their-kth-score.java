class Solution {
    public void sort(int[][] score,int start,int max){
        for(int i = 0;i < score[0].length;i++){
            int temp = score[start][i];
            score[start][i] = score[max][i];
            score[max][i] = temp;
        }
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i = 0;i < score.length;i++){
            int max = i;

            for(int j = i;j < score.length;j++){
                if(score[max][k] < score[j][k]) max = j;
            }

            sort(score,i,max);
        }

        return score;
    }
}
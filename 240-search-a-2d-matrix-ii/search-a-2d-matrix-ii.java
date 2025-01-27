class Solution {
    public boolean searchMatrix(int[][] ma, int target) {
        int n = ma.length;
        int m = ma[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            if(ma[i][j]==target) return true;
            if(target < ma[i][j]){
                    j--;// move left 
            }else{
                i++;// move rigth
            }
        }
        return false;
    }
}
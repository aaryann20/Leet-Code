class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int Mmax=-1;
        int n = accounts.length;
        for(int i = 0;i<n;i++){
            int max = 0;
            for(int j = 0;j<accounts[i].length;j++){
                max = accounts[i][j] + max;
                Mmax = Math.max(max,Mmax);

            }
        }
        return Mmax;
        
    }
}
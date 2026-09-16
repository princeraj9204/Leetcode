class Solution {
    public int minimumArea(int[][] grid) {
        int maxr = Integer.MIN_VALUE;
        int minr = Integer.MAX_VALUE;
        int maxc = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    maxr = Math.max(maxr , i);
                    minr = Math.min(minr , i);
                    maxc = Math.max(maxc , j);
                    minc = Math.min(minc , j);
                }
            }
        }
        int len = maxc-minc+1;
        int wid= maxr-minr+1;
        return len*wid;
    }
}
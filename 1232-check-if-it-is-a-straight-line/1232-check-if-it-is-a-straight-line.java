class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        int dely = y2-y1;
        int delx = x2-x1;
        for(int i=2;i<coordinates.length;i++){
           int x3 = coordinates[i][0];
           int y3 = coordinates[i][1];
           if(dely*(x3-x2) != delx*(y3-y2)){
            return false;
           }
        }
        return true;
    }
}
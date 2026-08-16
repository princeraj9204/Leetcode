class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int xrange = target[0];
        int yrange = target[1];
        int idx = -1;
        int g = Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int a = Math.abs(drones[i][0]-xrange);
            int b = Math.abs(drones[i][1]-yrange);
            int sum = a+b;
            if(sum <= drones[i][2]){
                if(sum<g){
                idx = i;
                g = sum;
            }}
        }
        return idx;
    }
}
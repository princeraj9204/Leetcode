class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int a = Math.abs(source[0]-target[0]);
        int b = Math.abs(source[1]-target[1]);
        if(a == b){
            return 1;
        }
        int c = source[0]+source[1];
        int d = target[0]+target[1];
        if((c%2 == 0 && d%2 != 0) || (c%2 != 0 && d%2 == 0)){
            return -1;
        }else 
        return 2;
    }
}
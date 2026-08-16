class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i=0;i<fruits.length;i++){
            boolean b = true;
            int a = fruits[i];
            int j =0;
            while(j<baskets.length){
                if(baskets[j] < 0){
                    j++;
                    continue;
                }
                if(baskets[j] >= a){
                    baskets[j]=-1;
                    b = false;
                    break;
                }else {
                    j++;
                }
            }
            if(b == true){
                count++;
            }
        }
        return count;
    }
}
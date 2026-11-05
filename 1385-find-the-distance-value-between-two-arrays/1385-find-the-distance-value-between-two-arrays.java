class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0;i<arr1.length;i++){
                    boolean b = true;

            int a = arr1[i];
            for(int j=0;j<arr2.length;j++){
              if(Math.abs(a-arr2[j]) <= d){
                b = false;
              }
            }
            if(b){
                count++;
            }
        }
        return count;
    }
}
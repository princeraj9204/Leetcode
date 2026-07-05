class Solution {
    public int findLucky(int[] arr) {
       int a[] = new int[501];
       int max = Integer.MIN_VALUE;
       boolean b = true;
       for(int i=0;i<arr.length;i++){
        a[arr[i]]++;
       }
       for(int i=1;i<501;i++){
        if(i==a[i] && max<i){
            max = i;
            b = false;
        }
       }
       if(b==false){
        return max;
       }
       return -1;
    }
}
class Solution {
    public int longestMountain(int[] arr) {
        int i = 1;
        int len= arr.length;
        int max = 0;
        while(i < len-1){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int left = i;
                while(left>0 && arr[left] > arr[left-1]){
                    left--;
                }
                int right = i;
                while(right<len-1 && arr[right] > arr[right+1]){
                    right++;
                }
                int size = right-left+1;
                 max = Math.max(max , size);
                 i = right;
            }else {
                i++;
            }
            
        }
        return max;
    }
}
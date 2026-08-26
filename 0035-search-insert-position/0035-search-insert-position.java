class Solution {
    public int searchInsert(int[] nums, int target) {
        int start= 0;
        int len = nums.length;
        int end = len-1;
        while(start<=end){
           int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        int arr[] = new int[len+1];
        arr[len] = target;
        for(int i=0;i<len;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int m = 0;
        for(int i=0;i<len+1;i++){
            if(arr[i]==target){
                m = i;
                break;
            }
        }
         return m;  
    }
}
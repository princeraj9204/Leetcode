class Solution {
    public static int left(int arr[] , int key){
        int i=0;
        int j=arr.length-1;
        int ans=-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
                ans = mid;
                j = mid-1;
            }
            else if(arr[mid] > key){
                j = mid-1;
            }else {
                i = mid+1;
            }
        }
        return ans;
    }
    public static int right(int arr[] , int key){
        int i=0;
        int j=arr.length-1;
        int ans = -1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
                ans = mid;
                i = mid+1;
            }
            else if(arr[mid] > key){
                j = mid-1;
            }else {
                i = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
         ans[0] = left(nums , target);
         ans[1] = right(nums , target);
        return ans;
    }
}
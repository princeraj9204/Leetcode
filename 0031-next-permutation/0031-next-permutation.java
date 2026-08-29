class Solution {
    public static void reverse(int arr[] , int si , int ei){
        while(si < ei){
            int temp =  arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public void nextPermutation(int[] nums) {
       int p = -1;
       int n = nums.length;
       // p -> index
       for(int i=n-2;i>=0;i--){
        if(nums[i] < nums[i+1]){
            p = i;
            break;
        }
       }

       if(p == -1){
        reverse(nums,0,n-1);
        return;
       }
       // Q -> index
       int q =0;
       for(int i=n-1;i>p;i--){
        if(nums[i] > nums[p]){
            q = i;
            break;
        }
       }
       // swapping
       int temp = nums[p];
       nums[p] = nums[q];
       nums[q] = temp;

       reverse(nums , p+1 , n-1);
    }
}
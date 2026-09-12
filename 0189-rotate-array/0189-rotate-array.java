class Solution {
    public static void rotation(int arr[] , int si , int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       rotation(nums , n-k , n-1);
       rotation(nums , 0 , n-k-1);
       rotation(nums , 0 , n-1); 
    }
}


    //     reverse(nums,len-k,len-1);
    //    reverse(nums,0,len-k-1);
    //    reverse(nums,0,len-1)
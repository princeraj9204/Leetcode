class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n = nums.length;
      if(n == 1){
        return nums[0];
      }
      if(nums[n-1] != nums[n-2]){
        return nums[n-1];
      }
      if(nums[0] != nums[1]){
        return nums[0];
      }
      int si = 0;
      int ei = n-1;
      while(si<=ei){
        int mid  = (si+ei)/2;
        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            return nums[mid];
        }
        if(mid % 2 == 0){
            if(nums[mid] == nums[mid-1]){
                ei = mid-1;
            }else {
                si = mid+1;
            }
        }else if (mid % 2 != 0){
            if(nums[mid] == nums[mid-1]){
                si = mid+1;
            }else {
                ei = mid-1;
            }
        }
      }
      return 1;
    }
}
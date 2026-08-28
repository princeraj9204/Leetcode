class Solution {
    public static boolean ispresent(int arr[] , int key){
        int i=0;
        int j=arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
                return true;
            }else if(arr[mid] > key){
                j = mid-1;
            }else {
                i = mid+1;
            }
        }
        return false;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!ispresent(nums,i)){
                list.add(i);
            }
        }
        return list;
    }
}
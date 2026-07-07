class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        int i=0;
        int j=0;
        int k=0;
        int arr[] = new int[len];
        while(i<len1 && j<len2){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<len1){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<len2){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        double b = 0;
        if(arr.length == 1){
            b = arr[0];
            return b;
        }
        if(arr.length == 2){
            b = (arr[0]+arr[1])/2.0;
            return b;
        }
        if(len % 2 == 0){
            int si = 0;
            int ei = arr.length-1;
            int mid = (si+ei)/2;
            int a = arr[mid]+arr[mid+1];
            b = a/2.0;
        }else {
             int si = 0;
            int ei = arr.length-1;
            int mid = (si+ei)/2;
            b = arr[mid];
        }
        return b;
    }
}
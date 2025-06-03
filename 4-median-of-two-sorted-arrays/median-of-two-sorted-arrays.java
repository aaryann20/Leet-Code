class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int arr[] = new int[len];
        double ans = 0;
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        int st = 0;
        int end = len-1;
        int mid = st+(end-st)/2;
        if(len%2==0){
            ans = (arr[mid] +arr[mid+1])/2.0;
        }else{
            ans = arr[mid];
        }
       
        return ans;
    }
}
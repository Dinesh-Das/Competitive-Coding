class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ar= new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j]){
                ar[k++]=nums1[i++];
            }else{
                ar[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)ar[k++]=nums1[i++];
        while(j<nums2.length)ar[k++]=nums2[j++];
        if(ar.length%2!=0){
            return ar[ar.length/2];
        }
        i=ar.length/2;
        return (ar[i]+ar[i-1])/2.0;
    }
}
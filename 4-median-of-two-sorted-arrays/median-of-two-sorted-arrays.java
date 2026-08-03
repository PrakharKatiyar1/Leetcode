class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int i1 = 0, i2 = 0;
        int i = 0;
        for(i = 0; i < ans.length && i1 < nums1.length && i2 < nums2.length; i++){
            if(nums1[i1] < nums2[i2] ){
                ans[i] = nums1[i1++];
            }
            else{
                ans[i] = nums2[i2++];
            }
        }
        while(i1 < nums1.length){
            ans[i++] = nums1[i1++];
        }
        while(i2 < nums2.length){
            ans[i++] = nums2[i2++];
        }
        int z = ans.length;
        if(z % 2 != 0){
            return (double) ans[z / 2];
        }
        return (double) (ans[z / 2] + ans[(z - 1) / 2])/ 2;
    }
}
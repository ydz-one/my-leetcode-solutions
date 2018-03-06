class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0){
            int medianIndex = nums2.length % 2 == 0? nums2.length / 2 - 1 : nums2.length / 2;
            return nums2.length % 2 == 0 ? (nums2[medianIndex] + nums2[medianIndex + 1]) / 2.0 : (double) nums2[medianIndex];
        }
        
        if (nums2.length == 0){
            int medianIndex = nums1.length % 2 == 0? nums1.length / 2 - 1 : nums1.length / 2;
            return nums1.length % 2 == 0 ? (nums1[medianIndex] + nums1[medianIndex + 1]) / 2.0 : (double) nums1[medianIndex];
        }
        
        int n = nums1.length + nums2.length;
        int medianIndex = n % 2 == 0? n / 2 - 1 : n / 2;
        int indexOverall = 0;
        int index1 = 0;
        int index2 = 0;
        int median1 = 0;
        int median2 = 0;

        while (true){            
            int min = Integer.MAX_VALUE;
            
            if (index1 >= nums1.length){
                min = nums2[index2];
                index2++;
            } else if (index2 >= nums2.length){
                min = nums1[index1];
                index1++;
            } else {
                if (nums1[index1] < nums2[index2]){
                    min = nums1[index1];
                    index1++;
                } else {
                    min = nums2[index2];
                    index2++;
                }
            }
            
            if (indexOverall == medianIndex){
                median1 = min;
            }
            
            if (indexOverall == medianIndex + 1){
                median2 = min;
                return n % 2 == 0? (median1 + median2) / 2.0 : (double) median1;
            }
            indexOverall++;
        }
    }
}
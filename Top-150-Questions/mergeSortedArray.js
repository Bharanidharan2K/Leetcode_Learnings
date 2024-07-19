// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function,
// but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
// where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

var mergeSortedArray = function(nums1, m, nums2, n) {
    for(let i=0; i<n; i++){
        nums1[i+m] = nums2[i];
    }
    nums1.sort((a,b) => a-b);
    return nums1;
}

let nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
var result = mergeSortedArray(nums1, m, nums2, n);
console.log(result);
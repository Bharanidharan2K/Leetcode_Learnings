// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

var rotate = function(nums, k) {
    nums = reverse(nums, 0, nums.length-1);
    nums = reverse(nums, 0, k-1);
    nums = reverse(nums, k, nums.length-1);
    return nums;
}

var reverse = function(nums, start, end){
    while(start < end){
        let temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    return nums;
}

let nums = [1,2,3,4,5,6,7], k = 3;
//Expected : [5,6,7,1,2,3,4]
console.log(rotate(nums, k));
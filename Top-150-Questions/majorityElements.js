// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

var majorityElement = function(nums) {
    nums.sort((a,b) => a-b);
    majElement = Math.floor(nums.length/2)
    return nums[majElement];
}

console.log(majorityElement([2,2,1,1,1,2,2]))
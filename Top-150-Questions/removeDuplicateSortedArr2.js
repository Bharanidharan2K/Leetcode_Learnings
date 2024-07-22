// Given an integer array nums sorted in non-decreasing order, 
// remove some duplicates in-place such that each unique element appears at most twice. 
// The relative order of the elements should be kept the same.

var removeDuplicates = function(nums) {
    let i=2;
    let j=2;
    while(i<nums.length){
        if(nums[i] != nums[j-2]){
            nums[j] = nums[i];
            j++;
        }
        i++;
    }
    return j;
}

let nums = [0,0,1,1,1,1,2,3,3];
// Output = 7, nums = [0,0,1,1,2,3,3,_,_]

console.log(removeDuplicates(nums));
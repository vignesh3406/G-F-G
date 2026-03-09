
class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i])) return true;
        }
        return false;    
    }
}
//neetcode
/* Contains Duplicate
Solved 
Easy
Topics
Company Tags
Hints
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
 */

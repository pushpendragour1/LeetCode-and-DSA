package leetcode;
//1480: Running Sum of 1d Array
/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumArray {
    public static void main(String[] args) {
    int[] nums = {1,2,54,6,56,322,323};
    int ans[] = runningSum(nums);
    for(int i : ans)
     { 
        System.out.print(i +",");
     }
    }
    public static int[] runningSum(int[] nums)
    {
         for(int i=1; i<nums.length; i++)
          {
            nums[i] += nums[i-1];
          }
          return nums;
    }
}

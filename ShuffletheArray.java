package leetcode;
// 1470: Shuffle the Array

/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class ShuffletheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = arr.length/2;
        int ans[] = shuffle(arr, n);
        for(int i : arr)
        {
            System.out.print(i+",");
        }
        System.out.println("\n");
        
        for(int i : ans)
        {
            System.out.print(i+",");
        }
        
    }
    public static int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[n*2];
        for(int i=0; i< n; i++)
        {
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[n+1];
        }return ans;
    }
    
}

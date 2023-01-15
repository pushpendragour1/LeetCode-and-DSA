package ArrayQuestion;
import java.util.Arrays;

//Search max Element in the 2D array!

public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2,4,76,34,34,23,35,54,3003},
            {3,6,-5,8,2,1,887,43,3,22},
            {3,7,56,31,76,34,23,56,23}
            };
    int ans = search2D(arr);
      System.out.println("The Max Element present in the Array is : "+(ans));
      System.out.print("The Max Element present in the Array is : "+ Integer.MAX_VALUE);

    }
    static int search2D(int[][] arr)
    {
        int max =arr[0][0];
        for(int row =0; row<arr.length; row++)
        {
            for(int col=0; col<arr[row].length; col++)
            {
                if(max <= arr[row][col])
                  max = arr[row][col];
            }
        }
        return max;
    }
}

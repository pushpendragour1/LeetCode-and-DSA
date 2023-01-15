package ArrayQuestion;
import java.util.Scanner;
import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
     int[][] arr = {
                      {2,4,76,34,34,23},
                      {3,6,-5,8,2,1,887,43,3,22},
                      {3,7,56,31,76,34,23,56,23}
                      };
      Scanner input =new Scanner(System.in);
      System.out.print("Enter the target Element : ");
      int target = input.nextInt();
      int ans[] = search2D(arr,target);
      System.out.print("The Target Element are Exist is index's : "+ Arrays.toString( ans));
    }

   static int[] search2D(int[][] arr,int target)
    {
      for(int row=0; row<arr.length; row++)
      {
        for(int col=0; col<arr[row].length; col++ )
        {
            if(target == arr[row][col])
              return new int[] {row,col};
        }
      }
      return new int[] {-1,-1};
     }
    
}

package ArrayQuestion;
import java.util.Scanner;
//Search Element in the particulaRange in the array
public class SearchInRange {
    static int Searchelement(int[] arr,int target, int start, int end)
    {
        if(arr.length <0)
          return -1;
        
        for(int index = start; index <= end; index++ )
        {
            if(arr[index] == target )
             return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,54,6,7,3,7,34,2,32,4,4,-3,2-1,33,2,13,344,-3,4};
        System.out.print("Enter the Element : ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.print("Enter the starting Range : ");
        int start = input.nextInt();
        System.out.print("Enter the Ending Range : ");
        int end = input.nextInt();
        int ans = Searchelement(arr, target, start, end);
        if(ans != -1)
         System.out.println("Element are exist in Index :  " +ans);
        else
         System.out.println("Element are Not exist :  " +ans);
         
    }
    
}

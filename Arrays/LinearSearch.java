package ArrayQuestion;
import java.util.Scanner;

//linearsearch method here we are search our target!

public class LinearSearch {
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length <0)
           return -1;

      int element = target;
      for(int Indext = 0; Indext <arr.length; Indext++)
        {
            int searchElement = target;
            if(arr[Indext] == searchElement)
            {
                return Indext;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,64,33,23,66,22,44,55};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Target Element :  ");
        int target = input.nextInt();
        int Ans = linearSearch(arr,target); //call linearSearch method its return the target indix otherwise return -1;
       
        if(Ans != -1)
          System.out.println("Element are exist in Index number :  " +  Ans);
        else
          System.out.println("Element are not exist in the array : " +  Ans);
    }
}

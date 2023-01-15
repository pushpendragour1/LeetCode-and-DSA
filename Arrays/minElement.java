package ArrayQuestion;

public class minElement {

    static int minElement(int[] arr)
    {
        int element = arr[0];
        for(int index =1; index< arr.length; index++)
        {
            if(element >= arr[index])
             {
                element = arr[index];
             }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,4-1,55,-5,2,-10,39,48,100};  
        int ans = minElement(arr);
        System.out.println(" THe Small Element in the given array is : " + ans);
      }
    
}

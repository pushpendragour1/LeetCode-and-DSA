package ArrayQuestion;

public class MaxInArray {

    static int maxElement(int[] arr)
    {
        int max =arr[0];
      for(int index =1; index<arr.length; index++)
        {
            if(arr[index] >= max)
              max= arr[index];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={2,45,-5,3,6,-9,30,-1};
        int ans = maxElement(arr);
        System.out.println(" Max Element in the given array is : " + ans);
    }
    
}

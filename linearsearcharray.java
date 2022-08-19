public class Main
{
	public static void main(String[] args) {
	    int[] nums= {12,34,53,24,13,1,4,6,4,6,4};
	     int target=13;
	    int output = linearsearch(nums,target);
		System.out.println(output);
	}
	
	static int linearsearch(int[] arr, int target){
	     if(arr.length == 0){
	        return -1;
	    }
	  for(int index = 0; index < arr.length; index++){
	   	 int element = arr[index];
	   	 if(element == target)
	   	 {
	   	     System.out.println("YES YOU ELEMENT ARE EXIST :");
	   	     return index;
	   	 }
	   
	  }
	  System.out.println("YOUR ELEMENT ARE NOT EXIST:");
	  return -1;
}
}

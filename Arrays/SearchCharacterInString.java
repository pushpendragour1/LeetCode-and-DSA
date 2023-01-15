package ArrayQuestion;
import java.util.Arrays;
public class SearchCharacterInString {
    static boolean searchString(String str , char target)
    {
        for(int Element = 0; Element< str.length(); Element++)
        {
            if(target == str.charAt(Element))
            {
                return true;
            }
        }
        return false;
        
    }
    static boolean SearchInforEachLoop(String str , int target)
    {
        for(int Element : str.toCharArray())
        {
            if(Element == target)
             return true;
        }
        return false;
    }
    public static void main(String[] args) {
     String name = "kittuzz";
     char target = 'j';     
     boolean ans = searchString(name , target);
     System.out.println(name.toCharArray());
     System.out.println(Arrays.toString(name.toCharArray()));
     System.out.println( SearchInforEachLoop(name, target));

    /* if(ans == true)
      System.out.print("Character are exist in String : " + ans);
     else
      System.out.print("Character are not exist in String : " + ans);
    */
     }
       
}

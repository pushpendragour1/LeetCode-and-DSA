package leetcode;
//A pangram is a sentence where every letter of the English alphabet appears at least once.

/*Given a string sentence containing only lowercase English letters,
 return true if sentence is a pangram, or false otherwise.
 Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/
/*
public int indexOf(String str)
public int indexOf(String str, int fromIndex)
public int indexOf(int char)
public int indexOf(int char, int fromIndex*/
 
public class pangram {
    public static void main(String[] args) {
    String s = "thequickbrownfoxjumpsoverthelazydog";
     boolean ans = pangram(s);
     System.out.println(ans);
    }
    
     public static boolean pangram(String s)
     {
      for(int i=0; i< 26; i++)
      {  
         char curCh = (char) ('a'+i);
        
         if(s.indexOf(curCh) == -1)
           { return false; }
       }
          return true;
        
     }
}
    


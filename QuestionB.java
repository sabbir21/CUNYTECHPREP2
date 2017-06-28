// Considering Letter as all ASCII Chars
// Considering capital and small letter as separate letters 
// or we can make all letters small or capital
// if s has extra letters than t, then those letter will be followed at the end of the new string in the same order as in s 

import java.util.*;

public class QuestionB
{
     public static void main(String []args){
        System.out.println(sortByStrings("weatherM" , "therapyw"));
     }
     
     public static String sortByStrings(String s,String t)
     {
         int arrayS [] = new int [128]; 
         //Arrays.fill(arrayS, -1);
         
         for (int i=0; i<s.length(); i++)
         {
             arrayS[(int)s.charAt(i)] += 1;
             
         }
         
         StringBuilder x = new StringBuilder();
         
         for (int i=0; i<t.length(); i++)
         {
             if (arrayS[(int)t.charAt(i)] > 0)
             {
                while(arrayS[(int)t.charAt(i)] > 0) 
                {
                    x.append(t.charAt(i));
                    arrayS[(int)t.charAt(i)] --;
                }
             }
         }
         
         for (int i=0; i<arrayS.length; i++)
         {
             if (arrayS[i] > 0)
             {
                 while (arrayS[i] > 0)
                 {
                     x.append((char)i);
                     arrayS[i] --;
                 }
             }
             
         }
         return x.toString();
     }
}

import java.util.*;
public class QuestionE
{

     public static void main(String []args)
     {
        System.out.println(decodeString("2[4[ab]5[c]]"));
     }
     
     public static String decodeString(String s)
     {
         if (!s.contains("["))
         {
             return s;
         }
         
         int first = s.indexOf('[');
         int last = first;
         int count = 0;
         for (int i= first+1; i<s.length(); i++)
         {
             if ((s.charAt(i) == ']') && count == 0)
             {
                 last = i;
                 break;
             }
             else if (s.charAt(i) == ']')
             {
                 count -= 1;
             }
             else if ((s.charAt(i) == '['))
             {
                 count += 1;
             }
             else
                 continue;
         }
         
         String newString = s.substring(first+1, last);
         int times = Integer.parseInt(s.substring((first-1), first));
         
         return s.substring(0,first-1) + new String(new char[times]).replace("\0", decodeString(newString))/*String.join("", Collections.nCopies(times, decodeString(newString)))/*StringUtils.repeat(decodeString(newString), times)*/ + decodeString(s.substring(last+1));
     }
}

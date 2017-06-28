import java.util.*;
public class QuestionD
{
  static ArrayList<String> result;
  static HashMap<Character, Integer> map;
  public static void main(String[] args)
  {
    String inp = "ABA";
    result = new ArrayList<String>();
    map = new HashMap<Character, Integer>();
    for(char c: inp.toCharArray())
    {
      if (map.containsKey(new Character(c)))
      {
			int count = Integer.parseInt(map.get(c).toString());
      		map.put(new Character(c), new Integer(count+1));        
      }
      else
      {
        map.put(new Character(c), new Integer(1));       
      }
    }    
    combination("", inp.length());
    for(String res: result)
    {
      System.out.println(res);
    }
  }
  public static void combination(String s, int left)
  {
    if (left==0)
    {
        result.add(s);
        return;
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) 
    {
		char c =  entry.getKey();
        int count = entry.getValue();
        if(count>0)
        {
          map.put(new Character(c), new Integer(count-1));  
          combination(s+c, left-1);
          map.put(new Character(c), new Integer(count));  
        }
	}    
  }
  
}
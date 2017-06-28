// considered we need the count here only

public class QuestionA
{
     static int steps [] = {1,2,3}; 
     
     public static void main(String []args){
        int n = 10;
        System.out.println(countWays(n));
     }
     
     public static int countWays(int n)
     {
         int [] array = new int [n+1];
         array[0] = 1;
         
         for (int i=0; i<steps.length; i++)
         {
             for (int j=steps[i]; j<=n; j++)
             {
                 array[j] = array[j] + array[j-steps[i]];
                 
             } 
             
         }
         
         return array[array.length - 1];
     }
}
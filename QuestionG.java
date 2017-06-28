public class QuestionG
{

     public static void main(String []args){
        int x = 4;
        int denoms [] = {1,2,3};
        System.out.println(changePossibilities(x, denoms));
     }
     
     public static int changePossibilities(int n, int [] denoms)
     {
         int [] array = new int [n+1];
         array[0] = 1;
         
         for (int i=0; i<denoms.length; i++)
         {
             for (int j=denoms[i]; j<=n; j++)
             {
                 array[j] = array[j] + array[j-denoms[i]];
             }
             
         }
         
         return array[array.length - 1];
     }
}
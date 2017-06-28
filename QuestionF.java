// considered non empty graph and no '0' used as integer
// used only insert method, didn't use balancing as not required
// duplicate has been considered
// if the graph has only one value it will return '0' as meaning that there is no second largest number

public class QuestionF
{
    
    public static  Node root;
	public HelloWorld(){
		this.root = null;
	}

     public static void main(String []args){
        
        int x [] = {34, 2, 4, 10 ,29, 39, 44, 49, 88, 79, 1, 86};
        for (int i=0; i<x.length; i++)
        {
            insert(x[i]);
        }
        System.out.println(findsecondLargest());
     }
     
     public static void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public static int findsecondLargest()
	{
	    Node parent = root;
		Node current = root;
	    
	    if ((root.right == null) && (root.left == null))
	        return 0;
	        
	   while (current.right != null)
	   {
	       parent = current;
	       current = current.right;
	   }
	   if (current.left != null)
	   {
	       current = current.left;
	       while (current.right != null)
	       {
	           current = current.right;
	       }
	       return current.data;
	   } 
	    
	   else return parent.data;
	}
}

class Node
{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
public class Tree
{
    private Node root;


    public void Insert(Node n)
    {
	Node tmp = root;
	if (root == null)
	    {
		root = n;
		return;
	    }

	Node back = new Node();
	int c;
	while (tmp != null)
	    {
		c = tmp.getData().compareTo(n.getData());
		if (c > 0)
		    {
			back = tmp;
			tmp = tmp.getRight();
		    }
		else if (c < 0)
		    {
			back = tmp;
			tmp = tmp.getLeft();
		    }
	    }
	 c = back.getData().compareTo(n.getData());
	 if (c > 0)
	     {
		 back.setRight(n);
	     }
	 if (c < 0)
	     {
		 back.setLeft(n);
	     }
	 
		 

    }
    public Node Search(Integer i)
    {
	Node T = root;
	while(T != null)
	    {
		int c = T.getData().compareTo(i);
		if (c > 0)
		    {
			T = T.getRight();
		    }
		else if (c < 0)
		    {
			T = T.getLeft();
		    }

		else
		    return T;
	    }
	return null;
    }

    public static void main(String[] args)
    {
	Tree t = new Tree();
	Node n = new Node(10);
	t.Insert(n);
    }
	    
}

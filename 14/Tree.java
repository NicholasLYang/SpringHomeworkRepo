public class Tree
{
    private Node root;


    public void Insert(Node n)
    {
	if (root == null)
	    {
		root = n;
	    }
	Node tmp = root;
	Node back = new Node();
	while (tmp != null)
	    {
		int c = tmp.getData().compareTo(n.getData());
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
	     
    
}

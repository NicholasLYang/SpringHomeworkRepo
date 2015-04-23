public class Node
{
    
    private Integer data;
    private Node left, right;

    public Node (Integer i)
    {
	data = i;
    }
    public Node ()
    {
	data = null;
    }
    public Integer getData()
    {
	return data;
    }

    public void setData(Integer d)
    {
	data = d;
    }
    public Node getRight()
    {
	return right;
    }

    public void setRight(Node r)
    {
	right = r;
    }
    public Node getLeft()
    {
	return left;
    }
    public void setLeft(Node l)
    {
	left = l;
    }


}

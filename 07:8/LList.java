    import java.util.*;
    import java.io.*;
public class LList
{
    private Node l;
    private int len = 0;
    Random r;
    public LList()
    {
	l = new Node();
    }
    public String toString()
    {
	String s = new String();
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext())
	    {
		s = s + tmp + "--->";
	    }
	s = s + "null";
	return s;
    }
    public void add(int n)
    {
	Node a = new Node(n);
	Node s = l;
	while (s.getNext() != null)
	    {
		s = s.getNext();
	    }
	s.setNext(a);
	len++;
	
    }
    public void insert(Node n, int s)
    {
	Node c = l;
	c = findNode(s);
	n.setNext(c.getNext());
	c.setNext(n);
    }
    private Node findNode(int n)
    {
	Node c = l;
	while (n > 0 && c.getNext() != null)
	    {
		c = c.getNext();
		n--;
	    }
	return c;
    }
    public int find(int n)
    {
	return findNode(n).getData();
    }
    public int remove(int n)
    {
	Node c = l;
	c = findNode(n-1);
	int out = findNode(n).getData();
	c.setNext(findNode(n+1));
	return out;
    }
	       


}



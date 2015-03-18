    import java.util.*;
    import java.io.*;
public class LList
{
    private Node l = null;
    private int len = 0;
    Random r;
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
    public void add(Node n)
    {
	Node s = l;
	while (s.getNext() != null)
	    {
		s = s.getNext();
	    }
	s.setNext(n);
	len++;
	
    }
    public void insert(Node n, int s)
    {
	Node c = l;
	while (s > 0 && c.getNext() ! = null)
	    {
		c = c.getNext();
		s--;
	    }
	n.setNext(c.getNext());
	c.setNext(n);
    }
    public String find(int n)
    {
	Node temp = l;
	while(temp.getNext() != null && n > 0)
	    {
		temp = temp.getNext();
		n--;
	    }
	return temp.getData();
    }

}



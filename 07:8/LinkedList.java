import java.io.*;
import java.util.*;
    
public class LinkedList
{
    public Node first;
    public Random r;
    public String toString()
    {
	Node n = first;
	String s = new String();
	while (n != null)
	    {
		s = s + n.getData() + " --->";
		n = n.getNext();
	    }
	return s;
	
    }
    public LinkedList ()
    {
	r = new Random();
	first = new Node(r.nextInt(20));
    }
    public void add(Node n)
    {
	n.setNext(first);
	first = n;
    }
}

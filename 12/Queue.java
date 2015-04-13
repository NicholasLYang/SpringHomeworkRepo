import java.io.*;
import java.util.*;
public class Queue
{
    mazeNode front, back;
    public Queue (mazeNode N)
    {
	front = N;
	mazeNode tmp = N;
	while (tmp.getNext() != null)
	    {
		tmp = tmp.getNext();
	    }
	back = tmp;
		    
    }
    public Queue()
    {
	front = new mazeNode();
	back = new mazeNode();
	front.setNext(back);
    }
    public void enqueue(mazeNode n)
    {
	back.setNext(n);
	back = n;
    }
    public mazeNode dequeue()
    {
	mazeNode tmp = front;
	front = front.getNext();
	return tmp;
    }
    public String toString()
    {
	String s = new String();
	mazeNode tmp = front;
	while (tmp != null)
	    {
		s = s + "(" + tmp.getData() + ", " + tmp.getX() + ", " + tmp.getY() + ") ------->";
		tmp = tmp.getNext();
	    }
	return s;
    }
		    
    public boolean empty()
    {
	return front == null;
    }
    public char head()
    {
	return front.getData();
    }

}

import java.io.*;
import java.util.*;
public class Queue<E>
{
    Node<E> front, back;
    public Queue (Node<E> N)
    {
	front = N;
	Node<E> tmp = N;
	while (tmp.getNext() != null)
	    {
		tmp = tmp.getNext();
	    }
	back = tmp;
		    
    }
    public Queue()
    {
	front = new Node<E>();
	back = new Node<E>();
	front.setNext(back);
    }
    public void enqueue(E x)
    {
	Node<E> n = new Node<E>(x);
	back.setNext(n);
	back = n;
    }
    public E dequeue()
    {
	Node<E> tmp = front;
	front = front.getNext();
	return tmp.getData();
    }
    public String toString()
    {
	String s = new String();
	Node<E> tmp = front;
	while (tmp != null)
	    {
		s = s + tmp.getData() + ", ";
		tmp = tmp.getNext();
	    }
	return s;
    }
		    
    public boolean empty()
    {
	return front == null;
    }
    public E head()
    {
	return front.getData();
    }

}

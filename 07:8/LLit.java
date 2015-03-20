import java.io.*;
import java.util.*;

public class LLit<E> implements Iterable<E>
{
    private Node<E> l;

    public LLit()
    {
	l = new Node<E>();
    }
    public Iterator<E> iterator()
    {
	LLit<E> i = new LLit<E>(l.getNext());
	return i;
    }

}
	    

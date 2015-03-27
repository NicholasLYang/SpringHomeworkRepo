public class CAQueue
{
    private int[] a;
    private int front, back;
    // queue with fixed size of array
    public CAQueue (int size, int[] b)
    {
	if (size < b.length)
	    {
		throw new IndexOutOfBoundsException();
	    }
	else
	    {
		a = new int[size];
		for (int i = 0; i < b.length; i++)
		    {
			a[i] = b[i];
		    }
		front = 0;
		back = a.length-1;
	    }
    }
    public CAQueue(int size)
    {
	a = new int[size];
	front = 0;
	back = 1;
    }
    public CAQueue()
    {
	this(20);
    }
    public void enqueue(int x)
    {
	if (back == a.length - 1)
	    {
		throw new IndexOutOfBoundsException();
	    }
	else
	    {
		a[back + 1] = x;
		back++;
	    }
    }
    public String toString()
    {
	String s = new String();
	for (int i = front; i < back + 1; i++)
	    {
		s = s + a[i] + ", ";
	    }
	return s;
    }
    public int dequeue()
    {
	front = front + 1;
	return a[front - 1];
    }
    public boolean empty()
    {
	return a == null;
    }
    public int head()
    {
	return a[front];
    }

}

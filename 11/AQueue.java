public class AQueue
{
    private int[] a;
    private int front, back;
    public AQueue (int[] b)
    {
	a = b;
	front = 0;
	back = a.length-1;
    }
    public AQueue()
    {
	a = new int[2];
	front = 0;
	back = 1;
    }
    public void enqueue(int x)
    {
	int[] tmp = a;
	a = new int[tmp.length + 1];
	for (int i = 0; i < tmp.length; i++)
	    {
		a[i] = tmp[i];
	    }
	a[a.length-1] = x;
	back = a.length-1;
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

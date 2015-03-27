public class Driver
{
    public static void main(String[] args)
    {
	
	Queue<Integer> q = new Queue<Integer>(new Node<Integer>(9));
	for (int i = 0; i < 10; i++)
	    {
		q.enqueue(2 * i);
	    }
	System.out.println(q);
	int[] a = {1,2,3};
	AQueue aq = new AQueue(a);
	aq.enqueue(10);
	System.out.println(aq);
	    
    }
}

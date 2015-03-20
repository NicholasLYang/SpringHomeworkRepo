import java.io.*;
import java.util.*;
    
public class Driver
{
    public static void main(String[] args)
    {
	Random r = new Random();
	ArrayList<Integer> a = new ArrayList<Integer>();
	LList b = new LList();
	for (int i = 0; i < 10000; i++)
	    {
		int s = r.nextInt(20);
		a.add(s);
		b.add(s);
	    }
	System.out.println(a);
	System.out.println(b);
	long t1 = System.currentTimeMillis();
	int sum1 = 0;
	int sum2 = 0;
	for (int i = 0; i < 10000; i++)
	    {
		sum1 = a.get(i) + sum1;
		
	    }
	System.out.println(sum1);
	long elapsed1 = System.currentTimeMillis() - t1;
	System.out.println("ArrayList: " + elapsed1);
	long t2 = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++)
	    {
		
		sum2 = b.find(i + 1) + sum2;
	    }
	System.out.println(sum2);
	long elapsed2 = System.currentTimeMillis() - t2;
	System.out.println("LinkedList: " + elapsed2);
	

    }
}

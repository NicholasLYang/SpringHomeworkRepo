import java.io.*;
import java.util.*;
public class MergeSort
{


    public ArrayList<Integer> sort(ArrayList<Integer> aL)
    {
	ArrayList<Integer> output = new ArrayList<Integer>();
	if (aL.size() <= 1)
	    {
		return aL;
	    }
	else
	    {
		ArrayList<Integer> a = new ArrayList<Integer>();
		String aS = new String();
		ArrayList<Integer> b = new ArrayList<Integer>();
		String bS = new String();
		for (int i = 0; i < aL.size()/2; i++)
		    {
			a.add(aL.get(i));
		       	aS = aS + aL.get(i) + ", ";
		    }
		for (int j = aL.size()/2; j < aL.size(); j++)
		    {
			b.add(aL.get(j));
				bS = bS + aL.get(j) + ", ";
		    }
			System.out.println(aS);
			System.out.println(bS);
		
		ArrayList<Integer> out = merge(sort(a), sort(b));
		String s = new String();
		for (int j = 0; j < out.size(); j++)
		    {
			s = s + out.get(j) + ", ";
		    }
		System.out.println(s);
		return out;
	    }
	
    }
	
			    
    
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
	ArrayList<Integer> output = new ArrayList<Integer>();
	while (a.size() > 0 && b.size() > 0)
	    {
		if (a.get(0) > b.get(0))
		    {
			System.out.println("Added " + a.get(0));
			output.add(a.remove(0));
		
		    }
		else
		    {
			System.out.println("Added " + b.get(0));
			output.add(b.remove(0));
		    }
	    }
	while(a.size() > 0)
	    {
		
		output.add(a.remove(0));
			
	    }
	    
	while (b.size() > 0)
	    {
		output.add(b.remove(0));
	    }
	String s = new String();
	for (int i = 0; i < output.size(); i++)
	    {
		s = s + output.get(i) + ", ";
	    }
	System.out.println(s);
	return output;
    }
			

    
  
    public static void main(String[] args)
    {
	Random r = new Random();
	MergeSort ms = new MergeSort();
	ArrayList<Integer> x = new ArrayList<Integer>();
	String s = new String();
	for (int i = 0; i < 20; i++)
	    {
		x.add(r.nextInt(10));
		s = s + x.get(x.size() - 1) + ", ";
	    }
	System.out.println(s);
	x = ms.sort(x);
	s = new String();
	for (int i = 0; i < x.size(); i++)
	    {
		s = s + x.get(i) + ", ";
	    }
	System.out.println(s);
    
    }
	    
}


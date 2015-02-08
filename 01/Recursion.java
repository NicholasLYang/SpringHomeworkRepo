public class Recursion
{
    public int fib (int i)
    {
	if (i < 2)
	    {
		return 1;
	    }
	else
	    {
		return fib(i - 1) + fib(i - 2);
	    }
    }
    public int length(String s)
    {
	if (s.equals(""))
	    {
		return 0;
	    }
	else
	    {
		return 1 + length(s.substring(1));
	    }
    }
    public int numOfX (String s, String x)
    {
	if (s.equals(""))
	    {
		return 0;
	    }
	else if (s.substring(0,1).equals(x))
	    {
		return 1 + numOfX(s.substring(1), x);
	    }
	else
	    {
		return numOfX(s.substring(1), x);
	    }
    }

    public int bunnyEars2 (int i)
    {
	if (i == 0)
	    {
		return 0;
	    }
	if (i % 2 == 0)
	    {
		return 3 + bunnyEars2(i-1);
	    }
	else
	    {
		return 2 + bunnyEars2(i-1);
	    }
    }
    public int strCount(String str, String sub) {
	if (str.length() < sub.length())
	    {
		return 0;
	    }
	if (str.substring(0, sub.length()).equals(sub))
	    {
		return 1 + strCount(str.substring(sub.length()), sub);
	    }
	else
	    {
		return strCount(str.substring(1), sub);
	    }
    }
    
    public int sumDigits(int n)
    {
	if (n == 0)
	    {
		return 0;
	    }
	return n % 10 + sumDigits(n / 10);
    }
    public String allStar(String str)
    {
	if (str.length() < 2)
	    {
		return str;
	    }
	else
	    {
		return str.substring(0,1) + "*" + allStar(str.substring(1));
	    }
    }
  
	
    
    public static void main(String[] args)
    {
	Recursion r = new Recursion();
	System.out.println(r.sumDigits(123));
    }
}
	  

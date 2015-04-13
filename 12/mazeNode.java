public class mazeNode
{
    private int x;
    private int y;
    private char data;
    private mazeNode next;

    
    public mazeNode (int x, int y, char character)
    {
	data = character;
	next = null;
    }
    public mazeNode (char character)
    {
	data = character;
	next = null;
	x = 0;
	y = 0;
    }
    public mazeNode ()
    {
    }
    public char getData()
    {
	return data;
    }

    public void setData(char d)
    {
	data = d;
    }
    public int getX()
    {
	return x;
    }

    public void setX(int xcor)
    {
	x = xcor;
    }
    public int getY()
    {
	return y;
    }
    public void setY(int ycor)
    {
	y = ycor;
    }
    public void setNext(mazeNode n)
    {
	next = n;
    }
    public mazeNode getNext()
    {
	return next;
    }
    public String toString()
    {
	return "(" + data + ", " + x + ", " + y + ")";
    }


}

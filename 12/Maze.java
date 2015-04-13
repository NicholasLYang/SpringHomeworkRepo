import java.io.*;
import java.util.*;

public class Maze 
{
    private mazeNode[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='n';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new mazeNode[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = new mazeNode(line.charAt(i));
			    board[i][j].setX(i);
			    board[i][j].setY(j);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
	try
	    {		
		for (int y=0;y<maxY;y++)
		    {
			for (int x=0;x<maxX;x++)
			    s = s + board[x][y].getData();
			s=s+"\n";
		    }
	    }
	catch (Exception e)
	    {
	    }
	return s;
	    
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void solve(int x, int y){
	mazeNode start = board[x][y];
	System.out.println(start);
	Queue front = new Queue(start);
	try
	    {
		front.enqueue(board[x + 1][y]);
		front.enqueue(board[x - 1][y]);
		front.enqueue(board[x][y + 1]);
		front.enqueue(board[x][y - 1]);
	    }
	catch (Exception e)
	    {}
	while (!front.empty())
	    {
		mazeNode tmp = front.dequeue();
		if (tmp.getData()==wall ||
		    tmp.getData()==me ||
		    tmp.getData()==visited || solved)
		    {
			System.out.println(front);
			continue;
		    }


		if (tmp.getData()==exit)
		    {
			System.out.println(this);
			break;
		    }
		delay(100);
		board[tmp.getX()][tmp.getY()].setData(me);
		System.out.println(this);			
		try
		    {
			front.enqueue(board[tmp.getX() + 1][tmp.getY()]);
			front.enqueue(board[tmp.getX() - 1][tmp.getY()]);
			front.enqueue(board[tmp.getX()][tmp.getY() + 1]);
			front.enqueue(board[tmp.getX()][tmp.getY() - 1]);
			System.out.println(front);
			/*
			front.enqueue(board[tmp.getX() + 1][tmp.getY() + 1]);
			front.enqueue(board[tmp.getX() - 1][tmp.getY() + 1]);
			front.enqueue(board[tmp.getX() + 1][tmp.getY() - 1]);
			front.enqueue(board[tmp.getX() - 1][tmp.getY() - 1]);
			*/
		    }
		catch (Exception e)
		    {}
		System.out.println(front);
		
	    }
	

    }
    
		
    public static void main(String[] args){
	Maze m = new Maze();
	m.solve(5,5);
    }
}


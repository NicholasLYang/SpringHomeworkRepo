public class Chess
{
    public String[][] board;
    public String visited = "*";
    public String me = "N";
    public boolean solved = false;
    public int noMoves = 0;
    public Chess(int size)
    {
	board = new String[size + 2][size+ 2];
	for (int i = 1; i < board.length - 1; i++)
	    {
		for(int j = 1; j < board[1].length - 1; j++)
		    {
			board[i][j] = "#";
		    }
	    }

    }
    public Chess()
    {
	this(5);
    }
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public String toString()
    {
	String s = new String();
	for (int r = 0; r < board.length; r++)
	    {
	       
		for (int c = 0; c < board[1].length; c++)
		    {
			s = s + board[r][c] + " ";
		    }
		s = s + "\n";
	    }
	return s;
    }
    public void solve(int x, int y)
    {
	if (
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    noMoves--;
	    return;
	}

	if (noMoves == x * y){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	try{
	solve(x + 1,y + 2);
	solve(x - 1,y + 2);
	solve(x + 1,y - 2);
	solve(x - 1 ,y - 2);
	solve(x + 2, y - 1);
	solve(x + 2, y + 1);
	solve(x - 2, y - 1);
	solve(x - 2, y + 1);
	}
	catch (Exception e)
	    {}
	if (!solved){
	    board[x][y]= visited;
	    noMoves++;
	}
    }
	
	
    

	    
			  
    public static void main(String[] args)
    {
	Chess c = new Chess(15);
	System.out.println(c);
	c.solve(3, 3);
	System.out.println(c);
    }
}
	

	

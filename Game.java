import java.util.Scanner;
import java.io.*;


public class Game extends AbstractGame
{
	AbstractGame abstractGame;
	private Board parameterBoard;
	private boolean turn=true;




	
	public Game(String player1,String player2)
	{
		 super(player1,player2);
	}


	

	

	

	

	

	@Override
	void play(String from, String to) 
	{
		int j;
		j = Item.findFromLocation(from);
		parameterBoard = this.getBoard();
	try{
		if(this.red.getRenk()==turn)
		{
			if(board.items[j].isRed()==true)
			{
				this.board.items[j].move(to,parameterBoard,this);
				turn = false;
			}else {
				System.out.println("hatali hareket");
				turn = true;
			}

		}


		else if(this.black.getRenk()==turn)
		{
			if(board.items[j].isRed()==false)
			{
				this.board.items[j].move(to,parameterBoard,this);
				turn = true;
			}else {
				System.out.println("hatali hareket");
				turn = false;
			}
		}
		
	 }catch(Exception e)
	{
		e.getMessage();
	}
	}

	@Override
	void save_binary(String address)
	{
		File file = new File(address);

		ObjectOutputStream myOutPutStream;

			try
			{
				myOutPutStream = new ObjectOutputStream(new FileOutputStream(file));
				myOutPutStream.writeObject(red);
				myOutPutStream.writeObject(black);
				myOutPutStream.writeObject(board);
				myOutPutStream.close();

			}catch (IOException e)
			{
				e.printStackTrace();
			}




		
	}

	@Override
	void save_text(String address)
	{
		PrintWriter writer;
		try
		{
			File file = new File(address);
			file.createNewFile();
			writer = new PrintWriter(new FileOutputStream(file));

			writer.println(this.red.toString());
			writer.println(this.black.toString());
			writer.println("j\t"+ Board.pHelper(board.items,0) + "--"+Board.pHelper(board.items,1)+"--"+Board.pHelper(board.items,2)+"--"+Board.pHelper(board.items,3)+"--"+Board.pHelper(board.items,4)+"--"+Board.pHelper(board.items,5)+"--"+Board.pHelper(board.items,6)+"--"+Board.pHelper(board.items,7)+"--"+Board.pHelper(board.items,8));
			writer.println(" \t|  |  |  |\\ | /|  |  |  |");
			writer.println("i\t"+ Board.pHelper(board.items,9) + "--"+Board.pHelper(board.items,10)+"--"+Board.pHelper(board.items,11)+"--"+Board.pHelper(board.items,12)+"--"+Board.pHelper(board.items,13)+"--"+Board.pHelper(board.items,14)+"--"+Board.pHelper(board.items,15)+"--"+Board.pHelper(board.items,16)+"--"+Board.pHelper(board.items,17));
			writer.println(" \t|  |  |  |/ | \\|  |  |  |");
			writer.println("h\t"+  Board.pHelper(board.items,18) + "--"+ Board.pHelper(board.items,19)+"--"+ Board.pHelper(board.items,20)+"--"+ Board.pHelper(board.items,21)+"--"+ Board.pHelper(board.items,22)+"--"+ Board.pHelper(board.items,23)+"--"+ Board.pHelper(board.items,24)+"--"+ Board.pHelper(board.items,25)+"--"+ Board.pHelper(board.items,26));
			writer.println(" \t|  |  |  |  |  |  |  |  |");
			writer.println("g\t"+ Board.pHelper(board.items,27) + "--"+Board.pHelper(board.items,28)+"--"+Board.pHelper(board.items,29)+"--"+Board.pHelper(board.items,30)+"--"+Board.pHelper(board.items,31)+"--"+Board.pHelper(board.items,32)+"--"+Board.pHelper(board.items,33)+"--"+Board.pHelper(board.items,34)+"--"+Board.pHelper(board.items,35));
			writer.println(" \t|  |  |  |  |  |  |  |  |");
			writer.println("f\t"+ Board.pHelper(board.items,36) + "--"+Board.pHelper(board.items,37)+"--"+Board.pHelper(board.items,38)+"--"+Board.pHelper(board.items,39)+"--"+Board.pHelper(board.items,40)+"--"+Board.pHelper(board.items,41)+"--"+Board.pHelper(board.items,42)+"--"+Board.pHelper(board.items,43)+"--"+Board.pHelper(board.items,44));
			writer.println(" \t| |");
			writer.println("e\t"+ Board.pHelper(board.items,45) + "--"+Board.pHelper(board.items,46)+"--"+Board.pHelper(board.items,47)+"--"+Board.pHelper(board.items,48)+"--"+Board.pHelper(board.items,49)+"--"+Board.pHelper(board.items,50)+"--"+Board.pHelper(board.items,51)+"--"+Board.pHelper(board.items,52)+"--"+Board.pHelper(board.items,53));
			writer.println(" \t|  |  |  |  |  |  |  |  |");
			writer.println("d\t"+ Board.pHelper(board.items,54) + "--"+Board.pHelper(board.items,55)+"--"+Board.pHelper(board.items,56)+"--"+Board.pHelper(board.items,57)+"--"+Board.pHelper(board.items,58)+"--"+Board.pHelper(board.items,59)+"--"+Board.pHelper(board.items,60)+"--"+Board.pHelper(board.items,61)+"--"+Board.pHelper(board.items,62));
			writer.println(" \t|  |  |  |  |  |  |  |  |");
			writer.println("c\t"+ Board.pHelper(board.items,63) + "--"+Board.pHelper(board.items,64)+"--"+Board.pHelper(board.items,65)+"--"+Board.pHelper(board.items,66)+"--"+Board.pHelper(board.items,67)+"--"+Board.pHelper(board.items,68)+"--"+Board.pHelper(board.items,69)+"--"+Board.pHelper(board.items,70)+"--"+Board.pHelper(board.items,71));
			writer.println(" \t|  |  |  |/ | \\|  |  |  |");
			writer.println("b\t"+ Board.pHelper(board.items,72) + "--"+Board.pHelper(board.items,73)+"--"+Board.pHelper(board.items,74)+"--"+Board.pHelper(board.items,75)+"--"+Board.pHelper(board.items,76)+"--"+Board.pHelper(board.items,77)+"--"+Board.pHelper(board.items,78)+"--"+Board.pHelper(board.items,79)+"--"+Board.pHelper(board.items,80));
			writer.println(" \t|  |  |  |\\ | /|  |  |  |");
			writer.println("a\t"+ Board.pHelper(board.items,81) + "--"+Board.pHelper(board.items,82)+"--"+Board.pHelper(board.items,83)+"--"+Board.pHelper(board.items,84)+"--"+Board.pHelper(board.items,85)+"--"+Board.pHelper(board.items,86)+"--"+Board.pHelper(board.items,87)+"--"+Board.pHelper(board.items,88)+"--"+Board.pHelper(board.items,89));
			writer.println(" \t1--2--3--4--5--6--7--8--9");
			writer.close();


		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	void load_text(String address)
	{
		try {
			File file = new File(address);
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine())
			{
				String temp = scan.nextLine();
				System.out.println(temp);
			}

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}


	}

	@Override
	void load_binary(String address) {
		File file = new File(address);
		ObjectInputStream inputStream;

		try
		{
			inputStream = new ObjectInputStream(new FileInputStream(address));
			this.red= (Player)inputStream.readObject();
			this.black= (Player)inputStream.readObject();
			this.board=(Board)inputStream.readObject();
			inputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean getTurn()
	{
		return turn;
	}

	public void setTurn(boolean turn)
	{
		this.turn = turn;
	}
}

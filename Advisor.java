
public class Advisor extends Item
{

	Advisor(String name, double point,boolean red) 
	{
		super(name, point,red);
	}

	
	public void move(String destination,Board board,Game game)
	{
		int j = Item.findFromLocation(this.getPosition());
		int i= Item.findToLocation(destination);
		boolean control = control(j,i,board);
		
		
		// k�rm�z� vezir hamlesi
		
		
		  if(control)
		  {
			  if ((i >= 84 & i <= 86) || (i >= 75 & i <= 77) || (i >= 66 & i <= 68))
			  {
				  if (i == j - 10 || i == j - 8 || i == j + 10 || i == j + 8 || i == j - 9 || i == j + 9 || i == j + 1 || i == j - 1)
				  {

					  if (board.items[i] != null) {
						  board.items[i].setPosition("xx");
						  game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
					  }

					  board.items[i] = board.items[j];
					  board.items[i].setPosition(destination);
					  board.items[j] = null;
				  }else
					  System.out.println("hatali hareket");
			  }else
				  System.out.println("hatali hareket");
		  }else
			  System.out.println("hatali hareket");
		// Siyah vezir hamlesi
		
			  if(control)
			  {
				  if ((i >= 3 & i <= 5) || (i >= 12 & i <= 14) || (i >= 21 & i <= 23))
				  {
					  if (i == j - 10 || i == j - 8 || i == j + 10 || i == j + 8 || i == j - 9 || i == j + 9 || i == j + 1 || i == j - 1)
					  {

						  if (board.items[i] != null) {
							  board.items[i].setPosition("xx");
							  game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
						  }

						  board.items[i] = board.items[j];
						  board.items[i].setPosition(destination);
						  board.items[j] = null;
					  }else
						  System.out.println("hatali hareket");
				  }else
					  System.out.println("hatali hareket");
			  }else
				  System.out.println("hatali hareket");
		
			
	}
}

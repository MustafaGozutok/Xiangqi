
public class Soldier extends Item
{

	Soldier(String name, double point,boolean red) 
	{
		super(name, point,red);
	}

	
	public void move(String destination,Board board,Game game)
	{
		boolean control;
		int i,j;
		
		j = Item.findFromLocation(this.getPosition());
		i = Item.findToLocation(destination);
		control = control(j,i,board);
		
		if(control)
		{
			if(board.items[j].getRed() == true)
			{
				if (j >= 45) {
					if (i == j - 9) {
						if (board.items[i] != null) {
							board.items[i].setPosition("xx");
							if(board.items[j].getRed())
							{
								game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
							}else
								game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
						}

						board.items[i] = board.items[j];
						board.items[i].setPosition(destination);
						board.items[j] = null;
					} else
						System.out.println("hatali hareket");
				} else if (j < 45) {
					if (j % 9 >= 1 && j % 9 <= 7) {
						if (i == j + 1 || i == j - 1 || i == j - 9 || i == j + 9) {

							if (board.items[i] != null) {
								board.items[i].setPosition("xx");
								if(board.items[j].getRed())
								{
									game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
								}else
									game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
							}

							board.items[i] = board.items[j];
							board.items[i].setPosition(destination);
							board.items[j] = null;
						} else
							System.out.println("hatali hareket");
					} else if (j % 9 == 8) {
						if (i == j - 1 || i == j - 9 || i == j + 9) {

							if (board.items[i] != null) {
								board.items[i].setPosition("xx");
								if(board.items[j].getRed())
								{
									game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
								}else
									game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
							}

							board.items[i] = board.items[j];
							board.items[i].setPosition(destination);
							board.items[j] = null;
						} else
							System.out.println("hatali hareket");
					} else if (j % 9 < 1) {
						if (i == j - 9 || i == j + 1 || i == j + 9) {

							if (board.items[i] != null) {
								board.items[i].setPosition("xx");
								if(board.items[j].getRed())
								{
									game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
								}else
									game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
							}

							board.items[i] = board.items[j];
							board.items[i].setPosition(destination);
							board.items[j] = null;
						} else
							System.out.println("hatali hareket");
					} else
						System.out.println("hatali hareket");
				}
			}
		else if(board.items[j].getRed() == false)
		{
			if(j<=44)
			{
				if(i==j+9)
				   {
					 
					  if(board.items[i] != null)
					  {
						  board.items[i].setPosition("xx");
						  if(board.items[j].getRed())
						  {
							  game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
						  }else
							  game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
					  }
					   
					   board.items[i] = board.items[j];
					   board.items[i].setPosition(destination);
			  		   board.items[j] = null;
				   }else
					System.out.println("hatali hareket");
			}
		    else if(j>44)
		    {
				if(j%9>=1 && j%9<=7)
				{
					if(i==j+1 || i==j-1 || i==j-9 ||i==j+9)
					{

						if(board.items[i] != null)
						{
							board.items[i].setPosition("xx");
							if(board.items[j].getRed())
							{
								game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
							}else
								game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
						}

						board.items[i] = board.items[j];
						board.items[i].setPosition(destination);
						board.items[j] = null;
					} else
						System.out.println("hatali hareket");
				}

				else if(j%9==8)
				{
					if(i==j-1 || i==j-9 || i==j+9)
					{

						if(board.items[i] != null)
						{
							board.items[i].setPosition("xx");
							if(board.items[j].getRed())
							{
								game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
							}else
								game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
						}

						board.items[i] = board.items[j];
						board.items[i].setPosition(destination);
						board.items[j] = null;
					}else
						System.out.println("hatali hareket");

				}
				else if(j%9==0)
				{
					if(i==j-9 || i==j+1 || i==j+9)
					{

						if(board.items[i] != null)
						{
							board.items[i].setPosition("xx");
							if(board.items[j].getRed())
							{
								game.red.setPuan((float)(game.red.getPuan()+board.items[i].getPoint()));
							}else
								game.black.setPuan((float)(game.black.getPuan()+board.items[i].getPoint()));
						}

						board.items[i] = board.items[j];
						board.items[i].setPosition(destination);
						board.items[j] = null;
					}else
						System.out.println("hatali hareket");
				}
			}
					  
		 }
		}else
			System.out.println("hatali hareket");
	  }
     
}

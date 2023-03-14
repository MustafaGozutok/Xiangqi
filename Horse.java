
public class Horse extends Item
{

	public Horse(String name, double point,boolean red) 
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
				//�st y�ne hareket
				if(board.items[j-9]== null && ((i==j-19)||(i==j-17)))
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

				}
				//sa� y�ne hareket
				else if(board.items[j+1]== null && ((i==j-7)||(i==j+11)))
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

				}
				
				//sol y�ne hareket
				else if(board.items[j-1]==null && ((i==j-11)||(i==j+7)))
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
				}
				
				//a�a�� y�ne hareket
				else if(board.items[j+9]==null && ((i==j+17)||(i==j+19)))
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
				}
				else
					System.out.println("hatali hareket");
				
				
				
				
			}else
				System.out.println("hatali hareket");
		
	}
}

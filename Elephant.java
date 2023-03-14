
public class Elephant extends Item {

	public Elephant(String name, double point, boolean red) {
		super(name, point, red);
	}


	public void move(String destination, Board board,Game game) {

		boolean control;
		int i, j;

		j = Item.findFromLocation(this.getPosition());
		i = Item.findToLocation(destination);
		control = control(j, i, board);

		if (control) {
			//k�rm�z� fil hareleti
			if (board.items[j].getRed())
			{
				if(i>=45)
				if (j >= 45 && j < 80)
				{
					if (board.items[j - 10] == null || board.items[j - 8] == null || board.items[j + 10] == null || board.items[j + 8] == null)
					{
						if (i == j - 20 || i == j - 16 || i == j + 20 || i == j + 16)
						{

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
						}else
							System.out.println("hatali hareket");
					}else
						System.out.println("hatali hareket");
				} else if (j >= 81) {
					if (board.items[j - 10] == null || board.items[j - 8] == null)
					{
						if (i == j - 20 || i == j - 16 || i == j + 20 || i == j + 16)
						{

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
						}else
							System.out.println("hatali hareket");
					}else
						System.out.println("hatali hareket");
				}
			}
			//siyah fil hareket
			else if (board.items[j].getRed() == false)
			{
				if(i<=44)
				if (j <= 44 && j > 10)
				{
					if (board.items[j - 10] == null || board.items[j - 8] == null || board.items[j + 10] == null || board.items[j + 8] == null)
					{
						if (i == j - 20 || i == j - 16 || i == j + 20 || i == j + 16)
						{

							if (board.items[i] != null)
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
					}else
						System.out.println("hatali hareket");
				} else if (j <= 10)
				{
					if (board.items[j + 10] == null || board.items[j + 8] == null)
					{
						if (i == j - 20 || i == j - 16 || i == j + 20 || i == j + 16)
						{

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
					}else
						System.out.println("hatali hareket");
				}
			}

		}
	}
}

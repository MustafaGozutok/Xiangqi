
public class Chariot extends Item {

	public Chariot(String name, double point, boolean red) {
		super(name, point, red);
	}

	public void move(String destination, Board board,Game game) {
		int j = Item.findFromLocation(this.getPosition());
		int i = Item.findToLocation(destination);
		boolean control = control(j, i, board);
		boolean controlPlace = true;
		int a = 0;
		int obstacle = 0;
		int itemp = 0;
		int jtemp = 0;

		int g = j % 9;

		if (control) {


			if (i == j - 9 || i == j - 18 || i == j - 27 || i == j - 36 || i == j - 45 || i == j - 54 || i == j - 63 || i == j - 72 || i == j - 81 || i == j + 9 || i == j + 18 || i == j + 27 || i == j + 36 || i == j + 45 || i == j + 54 || i == j + 63 || i == j + 72 || i == j + 81)
			{
				if (i < j)                    //üst ve aşağı yöne hareket kontrolü ve hareket
				{
					itemp = i;
					for (int h = 0;h<(Math.abs(i - j)/9)-1; h++) {
						if (board.items[itemp + 9] == null) {
							itemp += 9;
							continue;
						} else
							obstacle++;
						itemp += 9;
					}
					itemp = 0;
					if (obstacle == 0) {
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
				} else if (j < i) {
					jtemp = j;
					for (int h = 0; h < (Math.abs(i - j)/9)-1; h++) {
						if (board.items[jtemp + 9] == null) {
							jtemp += 9;
							continue;
						} else
							obstacle++;
						jtemp += 9;
					}
					jtemp = 0;
					if (obstacle == 0) {
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
				}

			}
			else if ((g <= i && i < j) || (j < i && i < j + (9 - g)))
			{
				jtemp = j;
				itemp = i;
				if (i > j)    //sağ yöne hareket kontrolü ve hareket
				{
					for (int h = 0; h < i - j - 1; h++) {
						if (board.items[jtemp + 1] == null) {
							jtemp++;
							continue;
						} else
							obstacle++;
						jtemp++;
					}
					jtemp = 0;
					if (obstacle == 0) {
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

				}
				if (j > i)  //sol yöne hareket kontrolü ve hareket
				{
					for (int h = 0; h < i - j - 1; h++) {
						if (board.items[itemp + 1] == null) {
							itemp++;
							continue;
						} else
							obstacle++;
						itemp++;
					}
					jtemp = 0;
					if (obstacle == 0) {
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
				}
			}
		}


	}

}


	
	



public class Item extends AbstractItem{

	private double point;
	private String name;
	private boolean red;
	private Board board;
	
	public Item(String name,double point,boolean red)
	{
		this.point=point;
		this.name=name;
		this.red = red;
	}

	public String toString()
	{
		return getName();
	}
	
	public boolean getRed()
	{
		return red;
	}
	public void setRed(boolean red)
	{
	   this.red=red;
	}
	
	public static int findToLocation(String to)
	{
		char c = to.charAt(0);								//i = integer that shows place to go in board's item array.
		Integer i = Integer.parseInt(to.substring(1));
		int x=0;
		if(c == 'a')
			x=81;
		if(c == 'b')
			x=72;
		if(c == 'c')
			x=63;
		if(c == 'd')
			x=54;
		if(c == 'e')
			x=45;
		if(c == 'f')
			x=36;
		if(c == 'g')
			x=27;
		if(c == 'h')
			x=18;
		if(c == 'i')
			x=9;
		if(c == 'j')
			x=0;
		
		i = x+(i-1);
		return i;
	}
	public static int findFromLocation(String from)
	{
		char c2 = from.charAt(0);								//j = integer that shows place what is in from in board's item array.
		Integer j = Integer.parseInt(from.substring(1));
		int z=0;
		if(c2 == 'a')
			z=81;
		if(c2 == 'b')
			z=72;
		if(c2 == 'c')
			z=63;
		if(c2 == 'd')
			z=54;
		if(c2 == 'e')
			z=45;
		if(c2 == 'f')
			z=36;
		if(c2 == 'g')
			z=27;
		if(c2 == 'h')
			z=18;
		if(c2 == 'i')
			z=9;
		if(c2 == 'j')
			z=0;
		
		j = z+(j-1);
		return j;
	}
	public boolean control(int j,int i,Board board)
	{
		if(i>=0 && i<=89)
		 if(board.items[i] == null || board.items[i].getRed() != board.items[j].getRed())
		{
			return true;
		}else
			return false;
		return false;
		
	}
	
	public boolean isRed(Item object)
	{
		if(object.toString().charAt(0)>=97)
		return true;
		else
			return false;
	}
	
	
	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public boolean isRed() {
		return red;
	}

	

	@Override
	public void move(String destination,Board b,Game g) {
		
		
		
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void move(String destination) {

	}
}

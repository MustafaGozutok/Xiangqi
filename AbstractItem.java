import java.io.Serializable;

public abstract class AbstractItem implements ItemInterface,Serializable {
	
	private String position;  // tahtadaki konumu gösterir. Örneğin, a1

	
	public void calculatePosition(String name,Board board)
	{	
		for(int i=0;i<board.items.length;i++)
		{
			int k=0;
			if(board.items[i].getName().equals(name))
			{
				char c = name.charAt(0);								
				Integer h = Integer.parseInt(name.substring(1));
				int x=0;
				
				
				
		 }
		}
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void move(String destination,Board board,Game g) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

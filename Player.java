import java.io.Serializable;

public class Player implements Serializable {
	
	float puan; // her taş yedikçe oyuncunun puanı taşın puanına göre artar.
	boolean renk;
	static int control= 0;
	String name;
	Player(String name)
	{
		this.name = name;
		puan=0;
		if(control == 0)
		{
			renk = true;
			control++;
		}else
			renk = false;
	}

	public float getPuan() {
		return puan;
	}
	public void setPuan(float puan) {
		this.puan = puan;
	}
	public boolean getRenk() {
		return renk;
	}
	public void setRenk(boolean renk) {
		this.renk = renk;
	}

	@Override
	public String toString()
	{
		String str ="";
		str += "Name:"+name;
		str += "\nPuan:"+puan;

		return str;
	}
}

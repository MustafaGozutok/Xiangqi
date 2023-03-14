
public class Board extends AbstractBoard{

	
	
	
	public static String pHelper(Item[] items,int i)
	{
		if(items[i] != null)
			 return items[i].toString();
		else
			 return " ";
	}
     
	@Override
	public void print() 
	{
		System.out.println("j\t"+ pHelper(items,0) + "--"+pHelper(items,1)+"--"+pHelper(items,2)+"--"+pHelper(items,3)+"--"+pHelper(items,4)+"--"+pHelper(items,5)+"--"+pHelper(items,6)+"--"+pHelper(items,7)+"--"+pHelper(items,8));
		System.out.println(" \t|  |  |  |\\ | /|  |  |  |");
		System.out.println("i\t"+ pHelper(items,9) + "--"+pHelper(items,10)+"--"+pHelper(items,11)+"--"+pHelper(items,12)+"--"+pHelper(items,13)+"--"+pHelper(items,14)+"--"+pHelper(items,15)+"--"+pHelper(items,16)+"--"+pHelper(items,17));
		System.out.println(" \t|  |  |  |/ | \\|  |  |  |");
		System.out.println("h\t"+ pHelper(items,18) + "--"+pHelper(items,19)+"--"+pHelper(items,20)+"--"+pHelper(items,21)+"--"+pHelper(items,22)+"--"+pHelper(items,23)+"--"+pHelper(items,24)+"--"+pHelper(items,25)+"--"+pHelper(items,26));
		System.out.println(" \t|  |  |  |  |  |  |  |  |");
		System.out.println("g\t"+ pHelper(items,27) + "--"+pHelper(items,28)+"--"+pHelper(items,29)+"--"+pHelper(items,30)+"--"+pHelper(items,31)+"--"+pHelper(items,32)+"--"+pHelper(items,33)+"--"+pHelper(items,34)+"--"+pHelper(items,35));
		System.out.println(" \t|  |  |  |  |  |  |  |  |");
		System.out.println("f\t"+ pHelper(items,36) + "--"+pHelper(items,37)+"--"+pHelper(items,38)+"--"+pHelper(items,39)+"--"+pHelper(items,40)+"--"+pHelper(items,41)+"--"+pHelper(items,42)+"--"+pHelper(items,43)+"--"+pHelper(items,44));
		System.out.println(" \t| |");
		System.out.println("e\t"+ pHelper(items,45) + "--"+pHelper(items,46)+"--"+pHelper(items,47)+"--"+pHelper(items,48)+"--"+pHelper(items,49)+"--"+pHelper(items,50)+"--"+pHelper(items,51)+"--"+pHelper(items,52)+"--"+pHelper(items,53));
		System.out.println(" \t|  |  |  |  |  |  |  |  |");
		System.out.println("d\t"+ pHelper(items,54) + "--"+pHelper(items,55)+"--"+pHelper(items,56)+"--"+pHelper(items,57)+"--"+pHelper(items,58)+"--"+pHelper(items,59)+"--"+pHelper(items,60)+"--"+pHelper(items,61)+"--"+pHelper(items,62));
		System.out.println(" \t|  |  |  |  |  |  |  |  |");
		System.out.println("c\t"+ pHelper(items,63) + "--"+pHelper(items,64)+"--"+pHelper(items,65)+"--"+pHelper(items,66)+"--"+pHelper(items,67)+"--"+pHelper(items,68)+"--"+pHelper(items,69)+"--"+pHelper(items,70)+"--"+pHelper(items,71));
		System.out.println(" \t|  |  |  |/ | \\|  |  |  |");
		System.out.println("b\t"+ pHelper(items,72) + "--"+pHelper(items,73)+"--"+pHelper(items,74)+"--"+pHelper(items,75)+"--"+pHelper(items,76)+"--"+pHelper(items,77)+"--"+pHelper(items,78)+"--"+pHelper(items,79)+"--"+pHelper(items,80));
		System.out.println(" \t|  |  |  |\\ | /|  |  |  |");
		System.out.println("a\t"+ pHelper(items,81) + "--"+pHelper(items,82)+"--"+pHelper(items,83)+"--"+pHelper(items,84)+"--"+pHelper(items,85)+"--"+pHelper(items,86)+"--"+pHelper(items,87)+"--"+pHelper(items,88)+"--"+pHelper(items,89));
		System.out.println();
		System.out.println(" \t1--2--3--4--5--6--7--8--9");
		System.out.println("--------------------------------");
	}

		public Board()
		{
									//label,point,isRed
				General gS1 = new General("Ş",0,false);
				gS1.setPosition("j5");
				General gK1 = new General("ş",0,true);
				gK1.setPosition("a5");
				Chariot kS1 = new Chariot("K",9,false);
				kS1.setPosition("j1");
				Chariot kS2 = new Chariot("K",9,false);
				kS2.setPosition("j9");
				Chariot kK1 = new Chariot("k",9,true);
				kK1.setPosition("a1");
				Chariot kK2 = new Chariot("k",9,true);
				kK2.setPosition("a9");
				Cannon tS1 = new Cannon("T",4.5,false);
				tS1.setPosition("h2");
				Cannon tS2 = new Cannon("T",4.5,false);
				tS2.setPosition("h8");
				Cannon tK1 = new Cannon("t",4.5,true);
				tK1.setPosition("c2");
				Cannon tK2 = new Cannon("t",4.5,true);
				tK2.setPosition("c8");
				Horse aS1 = new Horse("A",4,false);
				aS1.setPosition("j2");
				Horse aS2= new Horse("A",4,false);
				aS2.setPosition("j2");
				Horse aK1 = new Horse("a",4,true);
				aK1.setPosition("a2");
				Horse aK2 = new Horse("a",4,true);
				aK2.setPosition("a8");
				Advisor vS1 = new Advisor("V",2,false);
				vS1.setPosition("j4");
				Advisor vS2 = new Advisor("V",2,false);
				vS2.setPosition("j6");
				Advisor vK1 = new Advisor("v",2,true);
				vK1.setPosition("a4");
				Advisor vK2 = new Advisor("v",2,true);
				vK2.setPosition("a6");
				Elephant fS1 = new Elephant("F",2,false);
				fS1.setPosition("j3");
				Elephant fS2 = new Elephant("F",2,false);
				fS2.setPosition("j7");
				Elephant fK1 = new Elephant("f",2,true);
				fK1.setPosition("a3");
				Elephant fK2 = new Elephant("f",2,true);
				fK2.setPosition("a7");
				Soldier pS1 = new Soldier("P",1,false);
				pS1.setPosition("g1");
				Soldier pS2 = new Soldier("P",1,false);
				pS2.setPosition("g3");
				Soldier pS3 = new Soldier("P",1,false);
				pS3.setPosition("g5");
				Soldier pS4 = new Soldier("P",1,false);
				pS4.setPosition("g7");
				Soldier pS5= new Soldier("P",1,false);
				pS5.setPosition("g9");
				Soldier pK1 = new Soldier("p",1,true);
				pK1.setPosition("d1");
				Soldier pK2 = new Soldier("p",1,true);
				pK2.setPosition("d3");
				Soldier pK3 = new Soldier("p",1,true);
				pK3.setPosition("d5");
				Soldier pK4 = new Soldier("p",1,true);
				pK4.setPosition("d7");
				Soldier pK5= new Soldier("p",1,true);
				pK5.setPosition("d9");
				
				
				
				items = new Item[] {kS1,aS1,fS1,vS1,gS1,vS2,fS2,aS2,kS2,
								 	 null,null,null,null,null,null,null,null,null,
								     null,tS1,null,null,null,null,null,tS2,null,
								     pS1,null,pS2,null,pS3,null,pS4,null,pS5,
								     null,null,null,null,null,null,null,null,null,
								     null,null,null,null,null,null,null,null,null,
								     pK1,null,pK2,null,pK3,null,pK4,null,pK5,
								     null,tK1,null,null,null,null,null,tK2,null,
								     null,null,null,null,null,null,null,null,null,
								     kK1,aK1,fK1,vK1,gK1,vK2,fK2,aK2,kK2};
			
		}
}

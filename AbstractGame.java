
public abstract class AbstractGame {
	
	Board board;
	Player red;
	Player black;
	
	public AbstractGame(String player1,String player2)
	{
		board = new Board();
		red = new Player(player1);
		black = new Player(player2);
	}
	/*
	 * from pozisyonundaki taÅŸÄ± to pozisyonuna taÅŸÄ±r.
	 * EÄŸer hareket kural dÄ±ÅŸÄ± ise, ekrana "hatali hareket" mesajÄ± ekrana yazÄ±lÄ±r ve oyuncunun tekrar oynamasÄ± iÃ§in sÄ±rayÄ± deÄŸiÅŸtirmez.
	 * EÄŸer hareket sonucu biri oyunu kazandÄ± ise, "Å�AH MAT! X oyunu kazandÄ±. X'in puanÄ±: A, Y'nin puanÄ±: B" yazar. X ve Y oyuncularÄ±n ismidir. A ve B aldÄ±klarÄ± puanlardÄ±r.
	 * EÄŸer hareket sonucu pat oldu ise (ÅŸahÄ±n hiÃ§ bir yere hareket edememesi ve baÅŸka yapacak hareketinin olmamasÄ± durumu), "PAT" mesajÄ± ekrana yazÄ±lÄ±r ve oyun sonlanÄ±r. 
	 * */
	abstract void play(String from, String to);  
	
	/*
	 * Oyunun o anki hali belirtilen dosyaya binary olarak kaydedilir.
	 * */
	abstract void save_binary(String address);  
	
	/*
	 * Oyunun o anki hali belirtilen dosyaya metin dosyasÄ± olarak kaydedilir.
	 * */
	abstract void save_text(String address);  
	
	/*
	 * Belirtilen adreste kaydedilen metin dosyasÄ±na gÃ¶re oyunu yÃ¼kler ve oyun kaldÄ±ÄŸÄ± yerden devam eder. 
	 * DosyanÄ±n doÄŸru dosya olduÄŸunu varsayabilirsiniz.
	 * */
	abstract void load_text(String address);  
	
	
	/*
	 * Belirtilen adreste kaydedilen binary dosyaya gÃ¶re oyunu yÃ¼kler ve oyun kaldÄ±ÄŸÄ± yerden devam eder.
	 * DosyanÄ±n doÄŸru dosya olduÄŸunu varsayabilirsiniz.
	 * 
	 * */
	abstract void load_binary(String address);  
	
	
	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}


	public Player getRed() {
		return red;
	}


	public void setRed(Player red) {
		this.red = red;
	}


	public Player getBlack() {
		return black;
	}


	public void setBlack(Player black) {
		this.black = black;
	}
	
}

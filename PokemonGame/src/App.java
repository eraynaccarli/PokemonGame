
public class App {

	public static void main(String[] args) {
	
		Player player1 = new Player("Abdullah");
		Player player2 = new Player("Eray");
		
		Character[] player1Characters = new Character[2];
		Character[] player2Characters = new Character[2];

		player1Characters[0] = new Pikachu();
		player1Characters[1] = new Misty();
	
		player2Characters[0] = new Charizard();
		player2Characters[1] = new Pikachu();
		
		player1.setCharacters(player1Characters);
		player2.setCharacters(player2Characters);

		Game g = new Game(player1,player2);
		g.start();
		
	}

}

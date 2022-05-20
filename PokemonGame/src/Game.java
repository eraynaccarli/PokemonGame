
public class Game {

	private Player player1;
	private Player player2;
	
	Game(Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
		
	}
	
	
	public void start() {
		while(this.player1.isAlive() && this.player2.isAlive()) {
			Character player1Character = player1.getNextCharacter();
			Character player2Character = player2.getNextCharacter();
		
			if(this.player1.getHealth() < 10 && player1Character instanceof IBoostable) {
				IBoostable p = (IBoostable) player1Character;
				p.boost();
			}
			player1Character.hit(this.player2);
			if(!this.player2.isAlive()) {
				this.printResult();
				return;
			}
			
			if(this.player2.getHealth() < 10 && player2Character instanceof IBoostable) {
				IBoostable p = (IBoostable) player2Character;
				p.boost();
			}
			
			player2Character.hit(player1);
			this.printResult();
			
		}
		
			if(this.player1.isAlive()) {
				System.out.println("Player1 Kazandi");
			}
			else {
				System.out.println("Player2 Kazandi");
			}
	}


	private void printResult() {
		System.out.println("Name : " + this.player1.getName());
		System.out.println("Health : " + this.player1.getHealth());
		
		System.out.println();
		
		System.out.println("Name : " + this.player2.getName());
		System.out.println("Health : " + this.player2.getHealth());
		
	}
}

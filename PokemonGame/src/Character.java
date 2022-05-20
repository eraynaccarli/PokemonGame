
public class Character {

	private String characterName;
	private int power;
	
	Character(String characterName,int power){
		this.characterName = characterName;
		this.setPower(power);
	}
	
	public void hit(Player enemy) {
		enemy.setHealth(enemy.getHealth() - this.power);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void printAttackDetail() {
		System.out.println("Character name: " + this.characterName);
		System.out.println("Power : " + this.power);
	System.out.println("----------------");
	}
}

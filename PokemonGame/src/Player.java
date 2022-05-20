
public class Player {

	private String name;
	private int health = 100;
	private int lastCharacterIndice = 0;
	private Character [] characters;
	
	Player(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Character [] getCharacters() {
		return characters;
	}

	public void setCharacters(Character [] characters) {
		this.characters = characters;
	}

	public void printInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Health : " + this.health);
		System.out.println("Alive : " + this.isAlive());
	}
	
	public boolean isAlive() {
		return this.health > 0;
	}


	public Character getNextCharacter(){
		if(lastCharacterIndice == 2) {
			lastCharacterIndice = 0;
		}
		return characters[lastCharacterIndice++];
	}
	
	
	
}


public class Pikachu extends Character implements IBoostable{
	
	private static final int CONSTANT_POWER = 10;
	Pikachu() {
		super("Pikachu",CONSTANT_POWER );
		
	}
	@Override
	public void boost() {

		this.setPower(this.getPower() * 2);
		
	} 

}

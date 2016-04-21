public abstract class AmphibiousPet extends Pet{

	private int stage;

	public AmphibiousPet(String type, String name){
		super(type, name);
		stage = 0;
	}

	public abstract String swim();

	public abstract String walk();

	public int grow(){
		stage++;
		return stage;
	}

	public int getStage(){
		return stage;
	}
}
public abstract class Bird extends Animal{

	private int laidEggsAmount;
	private boolean inMothersNest;

	public Bird(String type){
		super(type);
		laidEggsAmount = 0;
		inMothersNest = true;
	}

	public void layEgg(){
		laidEggsAmount++;
	}

	public String leaveNest(){
		inMothersNest = false;
		return "The baby has left the nest! ";
	}

	public abstract String fly();
}
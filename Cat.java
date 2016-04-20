public class Cat extends Pet{

	public Cat(String myName){
		super("Cat", myName);
	}

	public String eat(){
		return this.getName() + " hunts down birds.";
	}
}
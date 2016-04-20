public class Seal extends Animal implements Performer{

	public Seal(){
		super("Seal");
	}

	public String eat(){
		return "The seal scarfs down fish.";
	}

	public String stuntList(){
		return "Clap\nDive\nSwim";
	}

	public void doStunt(String stunt){
		if(stunt.equals("Clap")){
			System.out.println("The seal claps.");
		}
		else if(stunt.equals("Dive")){
			System.out.println("The seal dives into the pool.");
		}
		else if(stunt.equals("Swim")){
			System.out.println("The seal swims in circles in the pool.");
		}
		else{
			System.out.println("Seals dont know how to " + stunt);
		}
	}
}
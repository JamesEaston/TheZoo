public class ZooTest {
  public static void main(String[] args) {
    Zoo myZoo = new Zoo();
    myZoo.addToZoo(new Dog("YouHeng's lunch"));
    myZoo.addToZoo(new Whale());
    myZoo.addToZoo(new Seal());
    myZoo.addToZoo(new Cat("Colby's mom"));
    //TODO: Add animals to the Zoo
    // - one Pet (not performer)
    // - one performer (not pet)
    // - one performer and pet
    // - one neither
    myZoo.rollCall();
  }
}
    
    

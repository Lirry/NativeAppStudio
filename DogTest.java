class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   
   // Methods of the clas...
   public String toString() {
      return "I am a dog called " + name + ", " + age + " years old. My Flea is called: " + dogsFlea.name;
   }
}

class DogOwner {

   // Properties of the class
   private String  name;
   private int     salary;
   private Dog     ownersDog;

   // Constructor of the class
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }

   // Methods of the class
   public String toString() {
      return "I am a man called " + name + ", i earn " + salary + "per year and my dog is called: " + ownersDog.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");
    
      Dog r = new Dog("Rex", 5, p);
      Dog j = new Dog("Jimbo", 6, s);
      Dog f = new Dog("Fido" , 9 , z);

      DogOwner a = new DogOwner("Angus", 15000, r);
      DogOwner b = new DogOwner("Brian", 20000, j);
      DogOwner c = new DogOwner("Charles", 25000, f);

      System.out.println(r.toString());
      System.out.println(j.toString());
      System.out.println(f.toString());

   }
}

// 8. a.ownersDog.dogsFlea.toString() would be the Flea Pop, because it is Rex's Flea, which is the dog of Angus. 


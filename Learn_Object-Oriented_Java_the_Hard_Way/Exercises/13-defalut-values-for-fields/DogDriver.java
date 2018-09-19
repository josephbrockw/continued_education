public class DogDriver {
	public static void main( String[] args ) {
		Dog a = new Dog();

		Dog pal = new Dog("Lassie", "rough Collie", 3, 52);
		Dog spike = new Dog("Yeller", "Mastador", 5, 86);
		Dog zeus = new Dog("Zeus", "Lab Mix", 5, 55);
		
		System.out.println( pal.getName() + " is a " + pal.getBreed() + ".");
		System.out.println( spike.getName() + " is a " + spike.getBreed() + ".");

		System.out.println( pal.getEverything() );
		System.out.println( a.getEverything() );
		System.out.println( zeus.getName() + " is a " + zeus.getBreed() + ", " + zeus.getAge() + " years old, " + zeus.getWeight() + " lbs.");
	}
}

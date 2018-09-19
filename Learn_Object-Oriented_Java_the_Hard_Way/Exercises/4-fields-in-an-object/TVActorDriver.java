public class TVActorDriver {
	public static void main( String[] args ) {
		TVActor a = new TVActor();
		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";
		a.position = "CEO";

		TVActor b = new TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";
		b.position = "Systems Architect";

		TVActor c = new TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";
		c.position = "Java Wizzard";
		
		System.out.println( a.name + " played " + a.role + " who is the " + a.position );
		System.out.println( b.name + " played " + b.role  + " who is the " + b.position);
		System.out.println( c.name + " played " + c.role + " who is the " + c.position );
	}
}

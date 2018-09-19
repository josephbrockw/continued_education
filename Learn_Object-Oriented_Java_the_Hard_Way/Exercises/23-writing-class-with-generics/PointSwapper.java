public class PointSwapper<Type> {
	private Type a, b;

	public PointSwapper( Type a, Type b ) {
		this.a = a;
		this.b = b;
	}

	public void swap() {
		Type temp = a;
		a = b;
		b = temp;
	}

	public Type getFirst() { return a; }
	public Type getLast()  { return b; }

	public Type isEqual( Type x, Type y ) {
		if( x == a && y == b) {
			return true;
		}
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}

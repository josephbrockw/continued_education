public class SphereCalcTester4 {
	public static void main( String[] args ) {
		SphereCalc4 c = new SphereCalc4(5);

		// c.setRadius(5);
		// c.setRadius();
		if( isNear(c.getSurfaceArea(), 314.159265359) ) {
			System.out.println("PASS: surfaceArea for " + c.getRadius());
		} else {
			System.out.println("FAIL: surfaceArea not what was expected for " + c.getRadius());
		}

		if( isNear(c.getVolume(), 523.598775598) ) {
			System.out.println("PASS: volume for " + c.getRadius());
		} else {
			System.out.println("FAIL: volume not what was expected for " + c.getRadius());
		}

		c.setRadius(0.1);
		if( isNear(c.getSurfaceArea(), 0.125663706) ) {
			System.out.println("PASS: surfaceArea for " + c.getRadius());
		} else {
			System.out.println("FAIL: surfaceArea not what was expected for " + c.getRadius());
		}

		if( isNear(c.getVolume(), 4.18879E-3) ) {
			System.out.println("PASS: volume for " + c.getRadius());
		} else {
			System.out.println("FAIL: volume not what was expected for " + c.getRadius());
		}

	}

	public static boolean isNear( double a, double b ) {
		return Math.abs(a-b) < 1E-9;
	}
}




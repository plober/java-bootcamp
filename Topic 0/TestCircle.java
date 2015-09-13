public class TestCircle { //Naming after the function is nothing new to me. Octave and Matlab trained me.
	public static void main(String[] args) { //ok, caps, no caps, brackets, braces and parenthesis. Not my friends.
		Circle c1 = new Circle();
		//AFAIK, I name (as c1) start and instance (as a new Circle) of the class Circle.
		System.out.println("The circle c1 has a radius of " //Makes morde sense to state which circle.
				+c1.getRadius()+" and area of "+ c1.getArea());
		
		// Now, get rid of defaults and start inputing variables
		Circle c2 = new Circle(5.0);
		System.out.println("The circle c2 has a radius of "
				+ c2.getRadius() + " and an area of " + c2.getArea());

		//Testing Plobermades
		Circle c3 = new Circle();
		System.out.println("Initial Radius: " + c3.getRadius());
		System.out.println("Initial Color: " + c3.getColor());
		c3.setRadius(2.0);c3.setColor("Greenish Pink");
		System.out.println("New Radius: " + c3.getRadius());
		System.out.println("New Color: " + c3.getColor());
	}
}
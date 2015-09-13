public class Circle{ // previously 'touched' the cicle.java from command line. Still unsure of how to create it by Eclipse
	//Being told that this 'private' variables are only seeable from within THIS class
	private double radius;
	private String color; 	// Would it make sense to initialize the color ("red") 
							//from here instead from the Constructor?
	
	// Also, What's the deal with the semicolons? I can't find any place that says how ::obviously:: important they are.
	// First constructor, by defaults 
	public Circle() {
		radius = 1.0; //Yeah, I got it. Doubles have decimals. Yay. -_-'
		color = "red";
	}
	
	// Second constructor, using input variables
	public Circle(double r) {
		radius = r; // Taking it from input
		color = "red";
	}
	
	// Public method for GETTING the radius
	public double getRadius() {
		return radius;
	}
	
	//Public method for computing the area of the circle
	public double getArea(){
		return radius*radius*Math.PI;
	}
}
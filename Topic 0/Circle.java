public class Circle{ // previously 'touched' the cicle.java from command line. Still unsure of how to create it by Eclipse
	//Being told that this 'private' variables are only seeable from within THIS class
	private double radius;
	private String color; 	// Would it make sense to initialize the color ("red") 
							//from here instead from the Constructor?
	
	// Also, What's the deal with the semicolons? I can't find any place that says how ::obviously:: important they are.
	// Been told that they are used to parse. I //knew// that, I'm just wondering //what's the deal// 
	// First constructor, using defaults 
	public Circle() {
		radius = 1.0; //Yeah, I got it. Doubles have decimals. Yay. -_-'
		color = "red";
	}
	
	// Second constructor, using input variables
	public Circle(double r) {
		radius = r; // Taking it from input
		color = "red";
	}
	
	// yet a third constructor, plobermade to use the color (so Eclipse quits complaining)
	public Circle(double ronco, String Octarine) {
		radius = ronco;
		color = Octarine;
	}
	
	// Public method for GETTING the radius
	public double getRadius() {
		return radius;
	}
	
	// Public getter of color
	public String getColor() {
		return color;
	}
	
	//Public method for computing the area of the circle
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//Public method for setting a different radius after previously set
	public void setRadius(double r){
		radius = r;
	}
	//Public ctral+space insert color "previously set" ;)
	public void setColor(String Octarine){
		color = Octarine;
	}
}
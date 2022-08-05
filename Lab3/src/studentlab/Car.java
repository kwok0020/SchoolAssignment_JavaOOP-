package studentlab;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: PUT YOUR NAME HERE. 
 */


/**
 * This class is named Car Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 * Compare this Car class with the Bicycle class also provided for you.
 * This approach is often preferred for clarity and ease of code maintenance.
 * 
 * Car() calls Car(String, boolean, double), program flow returns to
 * Car() and exits the constructor.
 * 
 * Car(String) calls Car(String, boolean, double), program flow returns
 * to Car(String) and exits the constructor.
 * 
 * Car(String, boolean) calls Car(String, boolean, double), program flow
 * returns to Car(String, boolean) and exits the constructor.
 * 
 * Car(String, boolean, double) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @see Bicycle
 * @author Sze Man Kwok
 */
public class Car {

	/**
	 * variety or type of Car.
	 */
	private String variety;
	
	/**
	 * If this Car is hybrid
	 */
	private boolean isHybrid;
	
	/**
	 * The weight of the Car in kilogram.
	 */
	private double weight;
	
	/**
	 * The default constructor sets variety to "car", isHybrid to false,
	 * and weight to zero.
	 */
	public Car() {
		this("car", false, 0);
		System.out.println("Car() was called");
		
	}
	
	/**
	 * This constructor sets the variety as passed, isHybrid to false,
	 * and weight to zero.
	 * @param variety The variety of this car.
	 */
	public Car(String variety) {
		this(variety, false, 0);
		this.variety = variety;

		System.out.println("Car(String) was called");

	}
	
	/** CODE ENDS HERE */
	
	/**
	 * 
	 * This constructor sets the variety as passed, isHybrid as passed,
	 * and weight to zero.
	 * @param variety The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 */
	public Car(String variety, boolean isHybrid) {
		this(variety, true, 0);
		this.variety = variety;
		
		if(isHybrid == true)
		{
			this.isHybrid = true;
		}else {
			this.isHybrid = false;
		}
		
		System.out.println("Car(String, boolean) was called");
	}
	
	
	/** CODE ENDS HERE */
	

	/**
	 * This constructor sets the variety as passed, isHybrid as passed, and
	 * weight as passed.
	 * @param variety The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 * @param weight The weight of this car in kg.
	 */
	public Car(String variety, boolean isHybrid, double weight) {
		this.variety = variety;
		this.isHybrid = isHybrid;
		this.weight = weight;


		System.out.println("Car(String, boolean, double) was called");
	
		
	}
	
	
	/** CODE ENDS HERE */
	
	/**
	 * Returns the variety for this car.
	 * @return the variety for this car.
	 */
	public String getVariety() {
		return variety;
	}
	/**
	 * Sets the variety for this car.
	 * @param variety The variety for this car.
	 */
	public void setVariety(String variety) {
		this.variety = variety;
	}
	/**
	 * Returns true if this Car is hybrid, false if it is not.
	 * @return true if this car is hybrid, false if it is not.
	 */
	public boolean isHybrid() {
		return isHybrid;
	}
	/**
	 * Sets the isHybrid state for this car, true means it's hybrid.
	 * @param isHybrid Use true if it is hybrid, use false if not hybrid.
	 */
	public void setIsHybrid(boolean isHybrid) {
		this.isHybrid = isHybrid;
	}
	
	
	/** CODE ENDS HERE */
	
	/**
	 * Weight of this Orange in kg.
	 * @return Weight of this car in kg.
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Sets the weight of this car, in kg.
	 * @param weight The weight of this car in kg.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * @return A String representation of this Car, each field is separated 
	 * by a comma in the order of variety, isHybrid, weight with (kg) added
	 * to the end of the weight field value.
	 */
	public String createReport() {
		return String.format("%s, %b, %.2f%s",variety,isHybrid,weight,"(kg)");
	}
}

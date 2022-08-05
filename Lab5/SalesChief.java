/**
 * This class is inherits from SalesSupervisor.
 * Then provide a toSting method to print out the information of the sales chief.
 * @author Rebecca, Sze Man Kwok
 *
 */
public class SalesChief extends SalesSupervisor{
	
	/**
	 * The constructor of the SalesChief subclass.
	 * @param n The name of the sales chief.
	 * @param a The age of the sales chief.
	 * @param location The location which the sales chief stay.
	 * @param salary The salary of the sales chief.
	 */
	public SalesChief(String n, int a, String location){
		super(n,a,location);
	}
	
	/**
	 * Returns the string representation of the object.
	 * @return a string representation of the object
	 */
	public String toString() {
		
	    return "Sales Chief=" + super.toString();
	}

}

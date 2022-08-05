/**
 * This class is inherits from SalesAgent and adds two more
 * field of location and salary. Then provide a toSting method to print out
 * the information of the sales supervisor.
 * @author Rebecca, Sze Man Kwok
 *
 */
public class SalesSupervisor extends SalesAgent {

	/**
	 * The salesSupervisor adds one more field
	 */
	private String location;
	
	/**
	 * The constructor of the SalesSupervisor subclass.
	 * @param n The name of the sales supervisor.
	 * @param a The age of the sales supervisor.
	 * @param location The location which the sales supervisor stay.
	 * @param salary The salary of the sales supervisor
	 */
	public SalesSupervisor(String n, int a, String location) {
		super(n,a);
		this.location = location;
	}
	

	/**
	 * overriding toString() method of SalesAgent to print more info.
	 * @return a string representation of the object
	 */
	public String toString() {
		
	    return "Sales Supervisor [super=" + super.toString() + ", location=" + location +"]";
	}
	



}

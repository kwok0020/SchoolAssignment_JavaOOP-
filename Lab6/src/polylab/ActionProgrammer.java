package polylab;

/**
 * This ActionProgrammer subclass is to represent a programmer
 * who pay depends on the number of apps that creates.
 * @author szeman
 *
 */
public class ActionProgrammer extends Programmer {

	// Wage of the programmer per piece of app created
	private final double wage;
	// The number of pieces of apps created
	private final double pieces;
	
	public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber,
			                int month, int year, double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		this.wage = wage;
		this.pieces = pieces;
	}

	// getter for Wage
	public double getWage() {
		return wage;
		
	}
	
	// getter for Pieces
	public double getPieces() {
		return pieces;
		
	}
	
	//calculate earnings; override abstract method earnings in Programmer
	@Override
	public double earnings() {
		return getPieces() * getWage();
	}
	
	public String toString() {
		return String.format("%s: %s\n%s: %s; %s: $%.2f", "action-programmer", super.toString(),
				             "pieces made", getPieces(), "wage per piece", getWage());
		

	}

}

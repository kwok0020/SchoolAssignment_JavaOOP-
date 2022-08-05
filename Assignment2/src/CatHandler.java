/**
 * This class CatHandler() need to create three inner class ExceptionAlpha(), ExceptionBeta()
 * and ExceptionGammer(). 
 * @author szeman
 *
 */
public class CatHandler {
	

	/**
	 * Create inner class ExceptionAlpha which extends Exception
	 * @author szeman
	 *
	 */
	public static class ExceptionAlpha extends Exception{}
	
	/**
	 * Create inner class ExceptionBeta which extends ExceptionAlpha
	 * @author szeman
	 *
	 */
	public static class ExceptionBeta extends ExceptionAlpha{}
	
	/**
	 * Create inner class ExceptionGammer which extends ExceptionBeta
	 * @author szeman
	 *
	 */
	public static class ExceptionGammer extends ExceptionBeta{}
	
	/**
	 * Declare checked exception of ExceptionBeta() and throws the exception
	 * @throws ExceptionBeta throws class ExceptionBeta
	 */
	public void eb() throws ExceptionBeta {
		throw new ExceptionBeta();
	}
	
	/**
	 * Declare checked exception of ExceptionGammer() and throws the exception
	 * @throws ExceptionGammer throws class ExceptionGammer
	 */
	public void eg() throws ExceptionGammer {
		throw new ExceptionGammer();
	}
	
	/**
	 * This is the main method to execute the try catch block will caught the
	 * subclass exceptions ExceptionBeta and ExceptionGammer then output the message 
	 * to show the message when it have been caught.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		CatHandler catHandler = new CatHandler();
		try {
			catHandler.eb();
		} catch (ExceptionAlpha e) {
		    System.out.println("Catch supclass: " + e.getClass().getSimpleName());
		    e.printStackTrace();
		}
		try {
			catHandler.eg();
		} catch (ExceptionAlpha e) {
		    System.out.println("Catch supclass: " + e.getClass().getSimpleName());
		    e.printStackTrace();
		}
		
		


	}

}

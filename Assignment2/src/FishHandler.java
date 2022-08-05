/**
 * This class FishHandler() will demonstrate rethrowing of an exception.
 * It will create two method easterEnding() and easterStarting(), then catch
 * the rethrown exception in the main method.
 * @author szeman
 *
 */
public class FishHandler {
	
	/**
	 * Define method easterEnding() to throws an Exception
	 * @throws Exception thrown Exception to class easterEnding()
	 */
	public static void easterEnding() throws Exception {
		System.out.println("Exception in easterEnding() method");
		throw new Exception("thrown from easterEnding() method");
	}
	
	/**
	 * Define method easterStaring() throws an Exception
	 * @throws Exception Exception to class easterStaring()
	 */
	public static void easterStaring() throws Exception{
		try {
			easterEnding();
		} catch (Exception e) {
			System.out.println("Catch inside easterStaring() method");
			throw e; //rethrow 
		}
	}
	
	/**
	 * This is the main method to execute. It will use the try catch block
	 * to catch the rethrown exception from easterStaring().
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			easterStaring();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

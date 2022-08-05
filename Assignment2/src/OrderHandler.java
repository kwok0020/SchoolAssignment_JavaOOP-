import java.io.IOException;

/**
 * This class OrderHandler() is to show the order of exception with the try catch block.
 * It will instantiate the superclass Exception and the subclass of IOException. 
 * @author szeman
 *
 */
public class OrderHandler {

	/**
	 * This is the main method to execute the try catch block to demonstrate the order
	 * of exception. The code will show a compilation error when the superclass Exception try to 
	 * execute first before the subclass IOException.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	
		/**
		 * This is the code which will getting error since the order of exception.
		 * This IOException will not be execute because it is a subclass of Exception and
		 * we need to catch the specific exception first. 
		 */
//		try {
//			throw new Exception();
//		} catch(Exception e) {
//			
//		} catch(IOException io) {
//			//it will show error
//		}
//		
//		
		/**
		 * This code will work which catch the specific exception first.
		 */
		try {
			throw new Exception();
		} catch(IOException io) {
			
		} catch(Exception e) {
			System.out.println("Catch Exception");
			e.printStackTrace();
		}
		
		
	}
	
}
  
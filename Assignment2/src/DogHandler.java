import java.io.IOException;

/**
 * This class DogHandler() will demonstrates the use of the catch block
 * by using catch(Exception exception). Create inner class of ExceptionDog() and 
 * ExceptionPuppy() then use the try catch blocks to throw 4 types of exceptions.
 * @author szeman
 *
 */
public class DogHandler {

	/**
	 * Create a ExceptionDog inner class which extends Exception
	 * @author szeman
	 *
	 */
	public static class ExceptionDog extends Exception{}
	
	/**
	 * Create a ExceptionPuppy extends ExceptionDog
	 * @author szeman
	 *
	 */
	public static class ExceptionPuppy extends ExceptionDog{}
	
	/**
	 * 
	 * Declare checked exception of ExceptionDog() and throws the exception.
	 * @throws ExceptionDog throws class ExceptionDog
	 * 
	 */
	public static void ed() throws ExceptionDog {
		throw new ExceptionDog();
	}
	
	/**
	 * Declare checked exception of ExceptionPuppy() and throws the exception.
	 * @throws ExceptionPuppy throws class ExceptionPuppy
	 */
	public static void ep() throws ExceptionPuppy {
		throw new ExceptionPuppy();
	}
	

	/**
	 * This the main method to execute the try catch block which throw exception of types:
	 * ExceptionDog, ExceptionPuppy, NullPointerException and IOException. It will use four
	 * separate methods to catch those exceptions and output the message to show
	 * the exception subclasses have been caught.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		DogHandler dogHandler = new DogHandler();
		
		try {
			dogHandler.ed();
		} catch (ExceptionDog e) {
		    System.err.println("Catch supclass: " + e.getClass().getSimpleName()); 
		}
		
		try {
			dogHandler.ep();
		} catch (ExceptionDog e) {
		    System.err.println("Catch supclass: " + e.getClass().getSimpleName());    
		}
		
		try {
			throw new NullPointerException();
		} catch(NullPointerException e) {
			System.err.println("Catch NullPointerException");
			
		}
		
		try {
			throw new IOException();
		} catch(IOException e) {
			System.err.println("Catch IOException");
			
		}
		
	
	
	}
	

}

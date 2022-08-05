/**
 * This class is to test program of SalesAgent and SalesSupervisor. 
 * Assign the value and output the information of Sales Agent and Supervisor.
 * @author Rebecca, Sze Man Kwok
 *
 */
public class SalesAgentTest
{  
   public static void main(String[] args)
   {
	  SalesAgent a = new SalesAgent("Andrew", 42);
	  SalesSupervisor s = new SalesSupervisor("James", 26, "Perth");	
	  	  
	  System.out.println(a.toString());
	  System.out.println(s.toString());


   }
}  
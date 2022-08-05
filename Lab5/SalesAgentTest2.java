/**
 * This class is to test program of SalesAgent, SalesSupervisor and, SalesChief. 
 * Assign the value and output the information of Sales Agent, Supervisor and, Chief.
 * @author Rebecca, Sze Man Kwok
 *
 */
public class SalesAgentTest2
{  
   public static void main(String[] args)
   {

	SalesAgent sales1 = new SalesAgent("Peter", 56);
	SalesAgent sales2 = new SalesAgent("John", 48);
	SalesSupervisor sales3 = new SalesSupervisor("Ifeoma", 53, "Toronto");	
	SalesChief sales4 = new SalesChief("Rebecca", 27, "Ottawa");
	
	System.out.println(sales1.toString());
	System.out.println(sales2.toString());
	System.out.println(sales3.toString());
	System.out.println(sales4.toString());
   }
}  
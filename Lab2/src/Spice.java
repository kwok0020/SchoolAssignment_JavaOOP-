/**
* TASK: Remember to include all necessary headers for your Javadoc, descriptions and explanations of what you have done in the appropriate places.
* ENSURE that you add appropriate Javadoc style comments to relevant parts of this code as you update this program to show that you understand it.
*
*/

/**
 * This program is to show a table of food spice traders.Then 
 * compute the sum of food spice trades for each month by using a 2D array.
 * 
 * @author Sze Man Kwok
 * @version 4.20.0
 * @since jdk11.0.13
 */

public class Spice
{
	
/**
 * This is the entry point for the application and contain the main-line logic.
 * Use a 2D array to create a table to output nine cities and the amount of traders 
 * for each month of the year for each city.
 * Then calculate and output the sum of traders of each month by column in a 2D Array.
 * @param args The command line arguments.
 */
public static void main(String[] args)
 {
   final int ROWS = 9;
   final int COLUMNS = 12;

   
  
   int[][] traders = 
      { 
         { 150, 140, 225, 130, 220, 110, 120, 100, 115, 200, 192, 224 },
         { 220, 137, 26, 82, 502, 615, 209, 947, 116, 214, 278, 238 }, 
         { 103, 203, 276, 308, 172, 246, 354, 118, 123, 310, 146, 152 }, 
         { 210, 260, 234, 108, 149, 202, 216, 58, 244, 155, 167, 221 },
         { 203, 274, 226, 182, 152, 107, 192, 265, 123, 110, 146, 152 },
         { 223, 184, 236, 234, 167, 121, 208, 201, 186, 109, 141, 176 },
	     { 136, 219, 131, 191, 187, 201, 278, 106, 153, 172, 109, 146 },
         { 201, 104, 121, 13, 121, 69, 246, 100, 123, 161, 69, 175 },
         { 100, 235, 106, 222, 175, 143, 208, 157, 163, 141, 208, 189 }
      };

   String[] cities = 
      { 
         "Ottawa", 
         "Perth", 
         "Pembroke",
         "Kingston", 
         "Toronto", 
         "Niagara",
	     "London",
         "Waterloo", 
         "Guelph"
      };
   
   System.out.println("              Month      Jan     Feb    March    April   May   June   July    Aug     Sept      Oct      Nov    Dec");
   System.out.println();

   /** TASK: It is important to know the number of spice traders per city. So you need to print out the number of traders for all cities (content of the array) for each month.
   * Update the code in this section by using a nested for loop. 
   * 
   */
   
   // TO DO: WRITE YOUR CODE FOR THIS SECTION HERE!!!! Check the sample output file (SpiceOutput) to see the expected pattern to print out these details using printf.


   /**
    * This code is to create a table of food spice trading.
    * Output 9 cities and the number of trader of each month by using
    * a 2D array.
    */
   for(int row = 0; row < traders.length; row++) {
    	System.out.print("              " + cities[row] + "\t");
    	for(int column = 0; column < traders[0].length; column++) {
    		System.out.print(traders[row][column] + "\t");
    	}
    	System.out.println("");
    	
    }
    
   

   /** TASK: Update the code in this section by writing a nested for loop (for the columns and rows of the array) to compute the sum (column). 
   * Print the column sum using printf. Check the sample output file (SpiceOutput) to see the expected pattern.
   */ 
   
   System.out.println();
   System.out.print("              Traders" + "\t");

   // TO DO: INSERT CODE HERE FOR THIS SECTION!!! Check the sample output file (SpiceOutput) to see the expected pattern.


   /**
    * This code is to calculate and output the total amount of traders for
    * each month by using a 2D array. 
    */
   for(int column = 0; column < traders[0].length; column++){
	    int sum = 0;
	    for (int row = 0; row < traders.length; row++) {
		   sum += traders[row][column];
	   }
	   
	   System.out.printf("%d%s", sum, "\t");

   }
   
  
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Food spice trading is very lucrative!" );
}
}

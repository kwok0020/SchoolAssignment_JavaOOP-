package polylab;

import java.util.Scanner;

public class MyPaySystemTest2 {

	public static void main(String[] args) {
		 // create subclass objects
		 SalariedProgrammer salariedProgrammer = 
		    new SalariedProgrammer(
		    "Emmanuel", "Okoro", "123-11-4567", 6, 1992, 500.00);
		 HourlyProgrammer hourlyProgrammer = 
		    new HourlyProgrammer(
		    "Mary", "Cheng", "890-22-1234", 12, 1981, 16.75, 40);
		 CommissionProgrammer commissionProgrammer = 
		    new CommissionProgrammer(
		    "Martha", "Peter", "567-33-8901", 9, 1983, 23000, .06);
		 BasePlusCommissionProgrammer basePlusCommissionProgrammer = 
		    new BasePlusCommissionProgrammer(
		    "John", "Mark", "234-44-5678", 3, 1978, 9000, .04, 300);
		 ActionProgrammer actionProgrammer =
		    new ActionProgrammer(
		    "Peter", "Peter", "123-45-6789", 5, 1995, 500, 3);

		 System.out.println("Programmers are processed individually:\n");
		 
		 System.out.printf("%s\n%s: $%,.2f\n\n", 
		    salariedProgrammer, "earned", salariedProgrammer.earnings());
		 System.out.printf("%s\n%s: $%,.2f\n\n",
		    hourlyProgrammer, "earned", hourlyProgrammer.earnings());
		 System.out.printf("%s\n%s: $%,.2f\n\n",
		    commissionProgrammer, "earned", commissionProgrammer.earnings());
		 System.out.printf("%s\n%s: $%,.2f\n\n", 
		    basePlusCommissionProgrammer, 
		    "earned", basePlusCommissionProgrammer.earnings());
		 System.out.printf("%s\n%s: $%,.2f\n\n", 
		    actionProgrammer, 
		    "earned", actionProgrammer.earnings());

		 /** create and initialize the programmer array */

		 
		 // TO DO: COMPLETE THIS PORTION. INSERT YOUR OWN CODE: 
		   //create the Programmer array elements as required. 
		   // Hint: How many elements array do you need to create? DO SO HERE!!!
		   
		   //START
		     // create 5 element Programmer array
		     Programmer[] programmer = new Programmer[5];
		     
		     // initialize array with Programmer
		     programmer[0] = salariedProgrammer;
		     programmer[1] = hourlyProgrammer;
		     programmer[2] = commissionProgrammer;
		     programmer[3] = basePlusCommissionProgrammer;
		     programmer[4] = actionProgrammer;
		     
		   //END

		   
		   //IMPLEMENT THE USE OF A SCANNER TO GET THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
		   //START 
		   
		   // create a scanner and ask for user input the current month
		   Scanner input = new Scanner (System.in);
		   System.out.println("Enter the current month (1 - 12):");
		   int month = input.nextInt();
		   //END


		 // TO DO: GET AND VALIDATE THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
		   // START
		   
		   // check the month is validate
		   if (month <= 0 || month > 12) {
			    throw new IllegalArgumentException(
			       "month (" + month + ") must be 1-12");
			 }
		   // END


		 System.out.println("Programmers processed polymorphically:\n");
		 
		 // generically process each element in array
		 for (Programmer currentProgrammer : programmer) {
		    System.out.println(currentProgrammer); // invokes toString

		    // determine whether element is a BasePlusCommissionProgrammer
		    if (currentProgrammer instanceof BasePlusCommissionProgrammer) {
		       // downcast Programmer reference to 
		       // BasePlusCommissionProgrammer reference
		       BasePlusCommissionProgrammer programmers = 
		          (BasePlusCommissionProgrammer) currentProgrammer;

		       double oldBaseSalary = programmers.getBaseSalary();
		       programmers.setBaseSalary(1.10 * oldBaseSalary);
		       System.out.printf(
		          "new base salary with 10%% increase is: $%,.2f\n",
		          programmers.getBaseSalary());
		    }

		    // TO DO: COMPLETE THIS PORTION: if this is the month of the programmer's birthday, add $500 to his salary
		    // otherwise just state what this programmer currently earned.
		    //START
		 	
		    if(month == currentProgrammer.getBirthDate().getMonth()) {
		    		System.out.println("earned $" + (currentProgrammer.earnings()) + " plus $500.00 birthday bonus\n");
			
		    	}else {
		    		System.out.println("earned $" + currentProgrammer.earnings() + "\n");
		    	}
		    }
		    
		      // END


		 // get type name of each object in programmers array
		 for (int j = 0; j < programmer.length; j++) {
		    System.out.printf("Programmer %d is a %s\n", j, 
		       programmer[j].getClass().getName()); 
		 }
		}
		}


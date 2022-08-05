package assignment3;

//22W Assignment 3 Solution: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document. Hints have been provided on yur tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are code inbetween the print statements (see assignment information).


//TO DO: YOUR TASK 1: Add the necessary import statements here.
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


/**
 * This is the CarBrandsList Class which contain main method and it will create 
 * two array list of list1 and list2 and print out the list by using
 * the specific methods.
 * @author szeman
 *
 */
public class CarBrandsList {

/**
 * This is the beginning of main method. It will create two LinkedList of String 
 * as list1 and list2 and add the rides on these two lists.Then use the asList method and the linkedList
 * constructor to takes a Collection argument. Also add the elements in list2 to list1
 * by using addAll method. After that create a printList() method to print out the updated
 * content of list1 then release list2 resource. The result will contains list by sort, uppercase,
 * deleting items, reverse, sort by alphabetical order and removing duplicate items by using
 * different methods.
 * @param args the command line arguments
 */
public static void main(String[] args) {
   // add rides to list1
   String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   
   // TO DO: YOUR TASK 2
   /**
    * set up and manipulate LinkedList objects
    */
   List<String> list1 = new LinkedList<String>();

   // add rides2 to list2
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
   
   // TO DO: YOUR TASK 3
   /**
    * set up and manipulate LinkedList objects
    */
   List<String> list2 = new LinkedList<String>();

   // HINT: In the section below you should insert code for method calls in main for each of the sections below.

   // TO DO: YOUR TASK 4
   /**
    * add the content of rides to list1
    */
   for ( String ride : rides)
	   list1.add(ride);
   
   
   // TO DO: YOUR TASK 5
   /**
    * add the content of rides2 to list2
    */
   for ( String ride : rides2)
	   list2.add(ride);

   // TO DO: YOUR TASK 6
   /**
    * add the elements of list2 to list1 by using the addAll method
    */
   list1.addAll(list2);
 
   // TO DO: YOUR TASK 7
   /**
    * Create printList() method to print out the updated list1 then release resource from list2
    */
   list2 = null;
   printList(list1);
   

  System.out.printf("%nDisplaying names of car brands in uppercase letters...");
   
   // TO DO: YOUR TASK 8
  /**
   * convent to uppercase string by using convertToUppercaseStrings() method.
   */
  convertToUppercaseStrings(list1);
  printList(list1);

   System.out.printf("%nDeleting car brands 5 to 7...");
   
   System.out.printf("%nHere is the current list of car brands...");
   
   // TO DO: YOUR TASK 9
   /**
    * remove the car brands 5-7 from list by using removeItems() method.
    */
   removeItems(list1, 5, 8);
   printList(list1);
   
   // TO DO: YOUR TASK 10  
   /**
    * print the list in reverse order
    */
   printReversedList(list1);

   System.out.printf("%nSorted car brands in alphabetical order...");

   // TO DO: YOUR TASK 11
   /**
    * sort the list by using Collections.sort() method
    */
   Collections.sort(list1);
   printList(list1);

   System.out.printf("%nRemoving duplicate car brands...");
   /**
    * print output with no duplicate by using printNonDuplicates() method
    */
   printNonDuplicates(list1);
   
}



// HINT: MORE TO DO: Insert all your methods in this section which includes: 

 // output List contents
private static void printList(List<String> list) {
	System.out.println("\nList is:");
	for(String ride : list)
    System.out.printf("%s ", ride);	
	System.out.println();
}

 // locate String objects and convert to uppercase
/**
 * Use convertToUppercaseStrings method to convert uppercase String.
 * The while condition calls method hasNext which contains from List.
 * Then call the toUpperCase method return a uppcase version of the String.
 * @param list List method
 */
private static void convertToUppercaseStrings(List<String> list) {
	ListIterator< String > iterator = list.listIterator();
	//get the item of list and convert to uppercase
	while( iterator.hasNext() ) {
		String ride = iterator.next();
		iterator.set(ride.toUpperCase());
	}
	
}


 // obtain sublist and use clear method to delete sublist items
/**
 * Use method removeItems to removes the range of items from the list.
 * The sublist takes two arguments of the beginning and the ending index.
 * The clear method of List will remove the elements of the sublist.
 * @param list Call List method subList
 * @param start The beginning index for the sublist
 * @param end The ending index for the sublist
 */
private static void removeItems(List<String> list, int start, int end) {
	list.subList(start, end).clear(); 
	
}

 // print the list in reverse order
/**
 * Use printReversedList method to reverse the list by calling the 
 * list method. the size return the number of items in the list.
 * Use while to calls method hasPrevios to move the list position backwards.
 * @param list call list method listIterator as an argument
 */
private static void printReversedList(List<String> list) {
	ListIterator<String> iterator = list.listIterator(list.size());
	System.out.println("\nReversed List:");
	
	while(iterator.hasPrevious())
		System.out.printf("%s ", iterator.previous());
	    System.out.println();
}

 //locate String objects and eliminate duplicates
/**
 * Using a HashSet to remove duplicates
 * @param collection constructor a HashSet from Collection argument
 */
private static void printNonDuplicates( Collection<String> collection) {
	Set<String> set = new HashSet<String>(collection);
	System.out.println("\nNon-duplicates are: ");
	
	for(String s : set)
	System.out.printf("%s ", s);
	System.out.println();
}
   

}


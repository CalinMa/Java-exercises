//Write a program that calculates the first prime number greater than a given natural number n;
// The exercise must contain a menu interface, from where you can choose different options.
//Example: if n=5, print 7; if n=11, print 13. 
//Pseudocode:
//make a menu that contains : 
//1. read the given natural number n;
//2. print the next prime number greater than n;
//3. exit the program

//What i need: 
// algorithm to check if a number is prime;
// condition to start checking for a prime number only from above the number n;
// print first prime number greater than n

package fundamenteleProgramarii;
import java.util.*;





public class problem1a {
	 public static long checkValue(String sir) { //function that checks some exceptions
	    	System.out.print(sir);
	    	try {
	    		Scanner s =new Scanner(System.in);
	    		long    l =s.nextLong();
	    		return  l;
	    	}
	    	catch(Exception exp) {
	    		System.out.println("------------------------------------------------");
	    		System.out.println("You entered a wrong number. Please enter a natural number: ");
	    		return checkValue(sir);
	    	}
	    }
	   
	//menu
	 public static int showMenu () { //this is the function that will print the menu when you hit "run"
		 System.out.println("--------------------------------------------------------------");	
		 System.out.println("1. Enter a natural number (n): ");
			System.out.println("2. Show the first prime number greater than n: ");
			System.out.println("3. Exit the program. ");
		 return (int) checkValue("Choose one of the options from above:");
	 }

	public static void main (String[] args) {
		int menuOptions,n = 0;
		do {
			
			Scanner scan = new Scanner(System.in);
			checkEnteredNumber classObject= new checkEnteredNumber();
			
			menuOptions=showMenu();
			
		
	switch(menuOptions) {	
		
		case 1: 
			System.out.println("-------------------------");
			System.out.println("Enter natural number n: ");
			
			n=classObject.checkNumberToBePositive();
			classObject.setN(n); 
			break;
			
		case 2: 
			classObject.getN(n);
			if (n==0) {
				System.out.println("--------------------------------------------------------");
				System.out.println("You did not enter number n. Enter a natural number now: ");
				n=classObject.checkNumberToBePositive();
				classObject.setN(n); 
			} 
				n=classObject.checkIfNumberIsPrime(n);
				System.out.println("--------------------------------------------------------------");
				System.out.println("The next prime number is: "+ n);
			
			break;
		
			default: System.out.println("Give any number from above");
		
		}
		
		}	while (menuOptions !=3);
		if (menuOptions == 3) System.out.println("Program finished. ");
			
			
}
}
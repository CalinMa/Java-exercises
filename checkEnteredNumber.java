package fundamenteleProgramarii;
import java.util.*;


import fundamenteleProgramarii.problem1a;
public class checkEnteredNumber {

	public int n;
	
	
	// constructor
	public checkEnteredNumber() {
		this.n=n;
	}
	
	// we want to make sure that the entered number is positive.
	public  int checkNumberToBePositive(){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while (n<0) {
			System.out.println("Please enter a positive integer value: ");
			 n = scan.nextInt();
		}	
		return(n);
	} 
	
	// Getter and setter
	public void setN(int n) {
		this.n = n;
		
	}
	public int getN(int n) {
		return n;
	}
	
	public static int checkIfNumberIsPrime (int n) {
			n++;
		    for (int i = 2; i < n ;i++) {
		      // condition for nonprime number
		      if (n % i == 0) {
		        n++;
		        i=2;
		      } else { continue; }
		    }
			return n;
	}

}

// fa functia de nr prim si apeeaz-o in main

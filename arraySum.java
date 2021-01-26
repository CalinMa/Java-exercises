//We have an array of n elements. Try to find an k position inside the array, so that the sum of left elements from k, and the sum of right elements from k are equal 
// if such a position exists, print it;

package acasa;

import java.util.*;

public class arraySum {
	
	
	public static int sumBetweenPositions (int [] array, int start, int end) {
		int sum, i;
		sum = 0;
		for (i = start; i<= end; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
		
	public static void main(String[] args) {
		System.out.println("Give the number of elements: ");
		int numberOfElements,foundPosition,sumLeft,sumRight,i;
		Scanner scanner = new Scanner(System.in);
		numberOfElements= scanner.nextInt();
		int[]arrayOfElements = new int [numberOfElements];
		for (i=0; i<numberOfElements;i++) {
			System.out.println("The element from the position "+i);
			arrayOfElements[i]=scanner.nextInt();
		}
		foundPosition = -1; // if foundPosition is good, then we modify the value;
		for (i=0; i < numberOfElements; i++) {
			sumLeft = sumBetweenPositions(arrayOfElements, 0, i-1);
			sumRight = sumBetweenPositions(arrayOfElements, i+1, numberOfElements-1);
			if (sumLeft==sumRight) {
				foundPosition=i;
			}
		}
		if (foundPosition == -1) System.out.println("There is no such position");
		else System.out.println("The position is: " + foundPosition);
	}
}

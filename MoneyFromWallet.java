// we have a wallet collection, empty at first. Then the user adds money, and finally we want to see how much money we have in the collection 

package acasa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class MoneyFromWallet {

// we will use this method to read the value of money bills, and add it to the collection
	public static void readBills(Collection<Integer> wallet) {
		int billValue; 
		billValue = 1;
		while (billValue != 0) {
			System.out.println("Enter bill value: ");
			Scanner scanner = new Scanner(System.in);
			billValue=scanner.nextInt();
			if (billValue !=0) wallet.add(billValue);
		}
		
	}
	//with this function we calculate the sum of all money from wallet collection
 public static int allMoney(Collection<Integer> wallet) {
	int totalSum,bill;
	totalSum=0;
	Iterator iterator;
	iterator=wallet.iterator();
	while (iterator.hasNext()) {
		bill = (int) iterator.next();
		totalSum = totalSum+bill;
		
	}
	 return totalSum;
	}
	
 public static void main (String[] args) {
		//initialize a new collection
		Collection<Integer> wallet = new ArrayList<>();
		//call the method
		readBills(wallet);
		int sum;
		//call the function and save the result in an integer
		sum = allMoney(wallet);
		System.out.println("The total sum from the wallet is: "+sum);
	}
}

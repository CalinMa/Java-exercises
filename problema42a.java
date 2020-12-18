//42. Să se determine produsul de numere consecutive care dau exact n, n dat.

package fundamenteleProgramarii;

import java.util.Scanner;

public class problema42a {
	public static void main (String[] args) {
//initializam variabilele
		int contor=0,numarIntrodus,aCheck,bCheck;
//citim numarIntrodus
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduceti numarul: ");
		numarIntrodus=scan.nextInt();
		
//cautam a si b consecutive, divizori ai lui numarIntrodus
		for (aCheck=0; aCheck<=numarIntrodus/2;aCheck++) {
			bCheck=aCheck+1;
			if (aCheck*bCheck==numarIntrodus) {
				System.out.println("Numarul introdus este produsul dintre "+aCheck+" si "+bCheck+", numere consecutive");
				contor++;
			} 
		}
// daca numarul introdus este impar, sau par dar care nu poate fi reprezentat ca si in cerinta: 		
		if (contor == 0) System.out.println("Acest numar nu poate fi reprezentat ca produsul dintre doua numere consecutive");
	}
}

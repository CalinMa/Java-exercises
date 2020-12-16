
//34. Fie n un număr natural dat. Calculaţi suma s a tuturor numerelor prime cu n, şi mai mici ca n.

package fundamenteleProgramarii;

import java.util.*;


public class problema34a {
	public static void main (String[] args) {
	int suma = 0, numarIntrodus, numarPrim;
	Set<Integer> multimeNumerePrime = new HashSet<Integer>();

	Scanner scan = new Scanner (System.in);
	System.out.println("Introduceti un numar natural:"); //citim orice numar natural
	numarIntrodus = scan.nextInt();
	
	//cautam toate numerele prime cu numarul introdus si mai mici decat acesta
	for (int i=1; i<numarIntrodus; i++) {
		int contor=0;
		//vedem daca numarul introdus este prim
		for (int divizor=2; divizor<=i/2; divizor++) {
				if(i%divizor == 0) contor++;
		}
		if (contor==0) {
		System.out.println("Numarul este "+i+" prim si il adaugam multimii de numere prime cu numarIntrodus");
		suma=suma+i; // crestem suma cu fiecare numar prim
		multimeNumerePrime.add(i); // adaugam fiecare nr prim multimii, pentru afisare
		
		} 
	}
	
	System.out.println("Multimea nr prime mai mici ca si numarIntrodus este: "+ multimeNumerePrime);
	System.out.println("Suma nr prime este: "+ suma);
}
}


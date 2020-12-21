//44. Să se determine CMMDC al unei secvenţe de numere date.
// Rez: pentru a afla cmmdc a doua sau mai multe numere, se vor lua factorii comuni la puterea cea mai mica;
package fundamenteleProgramarii;
import java.util.Scanner;


public class problema44a {
	 
	   public static long cmmdc (long a, long b) {
	       
		   if(b == 0)
			      return a;
			    return cmmdc(b, a%b);
			  }

	public static void main (String[] args) {
		  //Afisare initiala meniu 
	
		System.out.println("1. Introduceti lungimea secventei de numere. (minim 3 numere) ");
		System.out.println("2. Introduceti numerele secventei;");
		System.out.println("3. Afisati CMMDC numerelor din secventa;");
		System.out.println("4. Iesiti din program;");
		
		int cazuri;
		int lungimeSir=1;
	
	
		do {
			System.out.println("Alegeti una dintre optiunile de mai sus:");
			 Scanner scan = new Scanner(System.in);
		
			  int [] sir = new int[lungimeSir];
			 long rezultat = sir[0];
			cazuri = scan.nextInt();
			switch (cazuri) {
			   
				case 1 :
			    	System.out.println("Introdu lungimea secventei: ");
			    	lungimeSir = scan.nextInt();
			    	while (lungimeSir < 3) {
			    		System.out.println("Reintrodu o lungime de minim 3 numere:");
			    		lungimeSir = scan.nextInt();
			    	}  
				      System.out.println("Lungimea secventei va fi de "+ lungimeSir + " numere.");
				      sir = new int[lungimeSir];
				 
			    
			    case 2 :
			    	
			    	if (lungimeSir>=3) {
			    		System.out.println("Introduceti cele "+lungimeSir+" numere din secventa");
			    	 for(int j=0; j<lungimeSir; j++ ) {
				         sir[j] = scan.nextInt();
				      }
			    	
			    	} else {
			    		System.out.println("Lungimea secventei trebuie sa fie de minim 3 numere. Va rugam sa o introduceti acum: ");
			    		lungimeSir = scan.nextInt();
			    		while (lungimeSir < 3) {
				    		System.out.println("Reintrodu o lungime de minim 3 numere:");
				    		lungimeSir = scan.nextInt();
				    	}  
			    		sir = new int[lungimeSir];
			    		System.out.println("Introduceti numerele secventei: ");
			    		for(int j=0; j<lungimeSir; j++ ) {
					         sir[j] = scan.nextInt();
					      }
			    	}
			    
			    case 3 :

			    	 for(int i=1; i<sir.length; i++){
					      rezultat = cmmdc(sir[i], rezultat);
					    }
			    	 if (rezultat == 0) {System.out.println("Alegeti mai intai lungimea si numerele secventei!");
			    	 System.out.println("----------------------------------------------------------------------");
			    	 System.out.println("1. Introduceti lungimea secventei de numere. (minim 3 numere) ");
			 		System.out.println("2. Introduceti numerele secventei;");
			 		System.out.println("3. Afisati CMMDC numerelor din secventa;");
			 		System.out.println("4. Iesiti din program;");
			 		 System.out.println("----------------------------------------------------------------------");
			    	 }
			    	 else System.out.println("CMMDC: "+rezultat);
			    	 lungimeSir=1;
			    	 System.out.println("----------------------------------------------------------------------");
			    	 System.out.println("1. Introduceti lungimea secventei de numere. (minim 3 numere) ");
			 		System.out.println("2. Introduceti numerele secventei;");
			 		System.out.println("3. Afisati CMMDC numerelor din secventa;");
			 		System.out.println("4. Iesiti din program;");
			 		 System.out.println("----------------------------------------------------------------------");
			        break;
			   
			        }  
			
		} while (cazuri != 4);
		if (cazuri ==4 ) System.out.println("Program terminat");
		
	       
	 }
}

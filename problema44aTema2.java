//44. Să se determine CMMDC al unei secvenţe de numere date.

// Rez: pentru a afla cmmdc a doua sau mai multe numere, se vor lua factorii comuni la puterea cea mai mica;
package fundamenteleProgramarii;
import java.util.Scanner;


public class problema44aTema2 {
	
	
	 
	  
	   public static double citReal(String sir) {
	    	System.out.print(sir);
	    	try {
	    		Scanner s =new Scanner(System.in);
	    		double  d =s.nextDouble();
	    		return  d;
	    	}
	    	catch(Exception exp) {
	    		System.out.println("------------------------------------------------");
	    		System.out.println("Ati introdus o valoare gresita!! Dati un numar: ");
	    		return citReal(sir);
	    	}
	    }
	    
	    public static long citLong(String sir) { //am creat functia de citire care testeaza anumite valori gresite
	    	System.out.print(sir);
	    	try {
	    		Scanner s =new Scanner(System.in);
	    		long    l =s.nextLong();
	    		return  l;
	    	}
	    	catch(Exception exp) {
	    		System.out.println("------------------------------------------------");
	    		System.out.println("Ati introdus o valoare gresita!! Dati un numar: ");
	    		return citLong(sir);
	    	}
	    }
	   
	 public static int showMenu () { //am creat functia de afisare a meniului
		 System.out.println("--------------------------------------------------------------");	
		 System.out.println("1. Introduceti lungimea secventei de numere. (minim 3 numere) ");
			System.out.println("2. Introduceti numerele secventei;");
			System.out.println("3. Afisati CMMDC numerelor din secventa;");
			System.out.println("4. Iesiti din program;");
		 return (int) citLong("Alegeti una dintre optiunile de mai sus:");
	 }

	public static void main (String[] args) {
				
		int cazuri;
		int lungimeSir=1;
	
	
		do {
			
			 Scanner scan = new Scanner(System.in);
		
			  int [] sir = new int[lungimeSir];
			 long rezultat = sir[0];
			cazuri = showMenu(); //apelam functia de afisare a meniului;
			switch (cazuri) {
			   
				case 1 :
					System.out.println("----------------------------");
			    	System.out.println("Introdu lungimea secventei: ");
			    	lungimeSir = scan.nextInt();
			    	while (lungimeSir < 3) {
			    		System.out.println("--------------------------------------");
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
			    		System.out.println("-------------------------------------------------------------------------------------");
			    		System.out.println("Lungimea secventei trebuie sa fie de minim 3 numere. Va rugam sa o introduceti acum: ");
			    		lungimeSir = scan.nextInt();
			    		while (lungimeSir < 3) {
			    			System.out.println("--------------------------------------");
			    			System.out.println("Reintrodu o lungime de minim 3 numere:");
				    		lungimeSir = scan.nextInt();
				    	}  
			    		sir = new int[lungimeSir];
			    		System.out.println("--------------------------------");
			    		System.out.println("Introduceti numerele secventei: ");
			    		for(int j=0; j<lungimeSir; j++ ) {
					         sir[j] = scan.nextInt();
					      }
			    	}
			    
			    case 3 :

			    	 for(int i=1; i<sir.length; i++){
			    		 GCD rez = new GCD();
					      rezultat = rez.cmmdc(sir[i], rezultat);
					    }
			    	 if (rezultat == 0) {
			    		 System.out.println("--------------------------------------------------------------");
			    		 System.out.println("Alegeti mai intai lungimea si numerele secventei!");
			    	
			    	 }
			    	 else { 
			    		 System.out.println("--------");
			    		 System.out.println("CMMDC: "+rezultat);
			    		 System.out.println("--------");
			    	 		}
			    	 lungimeSir=1; //resetam lungimeSir la valoarea initiala;
			    
			        break;
			}
			          
	
			
		} while (cazuri != 4);
		if (cazuri ==4 ) System.out.println("Program terminat");
		
	       
	 }
}

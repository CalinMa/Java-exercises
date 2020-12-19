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
		  
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Introduceti lungimea secventei:");
	      int lungimeSir = scan.nextInt();
	      int [] sir = new int[lungimeSir];
	      long resultat = sir[0];
	      System.out.println("Introduceti numerele:");

	      for(int j=0; j<lungimeSir; j++ ) {
	         sir[j] = scan.nextInt();
	      }
		  
		  for(int i=1; i<sir.length; i++){
		      resultat = cmmdc(sir[i], resultat);
		    }
		  System.out.println("CMMDC: "+resultat);
          System.out.println("Program teminat");
	 }
}

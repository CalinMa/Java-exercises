package fundamenteleProgramarii;

public class GCD {
	 public static long cmmdc (long a, long b) {
	       
		   if(b == 0)
			      return a;
			    return cmmdc(b, a%b);
			  }
}

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		//receivng the input and declaring the variables
		int length = Integer.parseInt(args[0]);
		double result = 0.0;
		double fraction;
		int i = 0;

		//adding as many fractions as defined by the input,
		//by the order of 1 - 1/3 + 1/5 - 1/7 + ...
		while(i < length) {
			fraction = 1.0 / ((i * 2) + 1);
			if (i % 2 == 0) result += fraction;
			else result -= fraction;
			i++;
		}
		 //printing the result compared to the real value of PI
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + result * 4);
	}
}
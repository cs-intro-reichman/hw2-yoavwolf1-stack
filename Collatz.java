// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		//receiving the input and declaring the variables
		int rounds = Integer.parseInt(args[0]);
		String inputMode = args[1];
		boolean modeV = inputMode.equals("v"); //checking if the mode is "V", and then we need to print
		int seed = 1;
		int counter = 1;
		int num = seed;

		//the outer loop - runs the hailstone chain for each seed
		while(seed <= rounds) {
			if(modeV) System.out.print(seed + " ");
			//the inner loop - runs the specific hailstone from number to number
			while(num != 1 || counter == 1) { //when num == 1 we finished, and the second condition is for the first seed
				if(num % 2 == 0) num = num / 2;
				else num = num * 3 + 1;
				counter++;
				if(modeV) System.out.print(num + " ");
			}
			if(modeV) System.out.println("(" + counter + ")");
			//reseting the variables
			seed++;
			num = seed;
			counter = 1;
		}
		//the final print, the same for both modes ("V" and "C")
		System.out.println("Every one of the first " + rounds + " hailstone sequences reached 1.");
	}
}
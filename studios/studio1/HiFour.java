package studio1;

import cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("I see four people here. What is your name?");
		String s1 = ap.nextString("And you?");
		String s2 = ap.nextString("How about you?");
		String s3 = ap.nextString("Lastly, yours?");
		//
		// Say hello to the names in s0 through s3.
		//
		 System.out.println("Greetings" + s0 + ", " + s1 + ", " + s2 + " and " + s3 + '.');
	}
}
/* PP 2.5 Write an application that converts miles to kilometers. (One mile
equals 1.60935 kilometers.) Read the miles value from the user as
a floating point value.*/

import java.util.Scanner;
public class Kilometer {

	public static void main(String[] args) {
		
		double miles, km;
		final double MIL = 1.60935;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of miles to convert into kilometers:");
		miles = scan.nextDouble();
		
		km = miles * MIL;
		
		System.out.println("Miles: " + miles);
		System.out.println("Kilometers: " + km);
	}

}

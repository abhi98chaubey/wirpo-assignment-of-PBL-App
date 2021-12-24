// Java program to find type of input character
import java.io.*;
import java.util.*;

public class Main {

	public static void charCheck(char input_char)
	{
		// CHECKING FOR ALPHABET
		if ((input_char >= 65 && input_char <= 90)
			|| (input_char >= 97 && input_char <= 122))
			System.out.println(" Alphabet ");

		// CHECKING FOR DIGITS
		else if (input_char >= 48 && input_char <= 57)
			System.out.println(" Digit ");

		// OTHERWISE SPECIAL CHARACTER
		else
			System.out.println(" Special Character ");
	}

	// Driver Code
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		char input_char = sc.next().charAt(0);
		charCheck(input_char);
	}
}



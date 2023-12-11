package main;

//String[] args 
//It stores Java command-line arguments and is an array of type java.lang.String class. 
//Here, the name of the String array is args but it is not fixed and the user can use any name in place of it.


//Java Program to demonstrate
//the working of String[] args
//in the main() method

public class TestFour {

	// Commamd-Line Code ->
	// javac GeeksforGeeks.java
	// java GeeksforGeeks 1 2 3

	public static void main(String[] args)
	{
		for (String elem : args)
			System.out.println(elem);
	}
}


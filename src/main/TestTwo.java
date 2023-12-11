package main;

/*Void 
It is a keyword and is used to specify that a method doesn’t return anything.
As the main() method doesn’t return anything, its return type is void.
As soon as the main() method terminates, the java program terminates too.
Hence, it doesn’t make any sense to return from the main() method as JVM 
can’t do anything with the return value of it.*/


//Error: Main method must return a value of type void in class Main, please
//define the main method as:
//   public static void main(String[] args)

public class TestTwo {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I Live in India");
		return 0;
	}

}

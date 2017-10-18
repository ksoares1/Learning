/* Lambda expressions are a way to pass a block of code to an method
 * Functional Interface is an interface with one single method
 */

/*
 * 1. create and interface with a method where you put the code you want to run:
 * execute()
 */
interface Executable{
	void execute();
}

class Runner{
	public void run(Executable e) {
	// How to pass a block of code to run() on previous java versions? 
	
	System.out.println("Executing code block...");
	e.execute();
	/* 2. Now the class Runner accepts an object that implements the Executable interface "e"
	 * and can call that method execute()
	 */
	}
}

/**
 * @author ks
 *
 */
public class App {
	
	public static void main (String [] args) {
		
		/*
		 * 3. To run it, you need an instance of the Runner class
		 * and call the method run()
		 */
		Runner runner = new Runner();
		//runner.run();
		
		/*
		 * 4. To pass a block of code in previous versions of Java in run(), you would 
		 * need an object that would implement the interface, like this: 
		 */
		runner.run(new Executable() {
			public void execute() {
				System.out.println("Hello there!");
				/*
				 * 5. The whole point of all this code is to pass this "Hello there!" code
				 * through the method run()
				 */
			}			
		});
		
		// 6. HOW TO DO ALL THAT WITH LAMBDA
		System.out.println("=========================");
		//runner.run(() -> System.out.println("Hello there!"));
		
		/*
		 *  If you want to run more than one block of code, or multiple expressions,
		 *  you can do it:
		 */
		runner.run(() -> {
			System.out.println("Hello there!");
			System.out.println("This is code passed in a lambda expression..");
		});
		
	}

}

import java.util.Scanner;

public class Main {
	
	public static void main(String argv[]) {
	    System.out.println("Dining philosophers problem.");
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter number of philosophers: ");
		int philosophersNumber = reader.nextInt();
		reader.close();

		Philosopher philosophers[] = new Philosopher[philosophersNumber];
		Chopstick chopsticks[] = new Chopstick[philosophersNumber];

	    for (int i = 0; i < philosophersNumber; i++) {
	      chopsticks[i] = new Chopstick();
	    }

	    for (int i = 0; i < philosophersNumber; i++) {
	      philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % philosophersNumber]);
	      philosophers[i].start();
	    }
	}
	
}

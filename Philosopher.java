import java.util.Random;

public class Philosopher extends Thread {

    public int id;
    public Chopstick leftChopstick;
    public Chopstick rightChopstick;

    Philosopher(int _id, Chopstick left, Chopstick right) {
      id = _id;
      leftChopstick = left;
      rightChopstick = right;
    }

    public void run() {
      System.out.println("Philosopher " + id + " is thinking");

      while (true) {
        leftChopstick.grab();
        System.out.println("Philosopher " + id + " grabs left chopstick.");
        rightChopstick.grab();
        System.out.println("Philosopher " + id + " grabs right chopstick.");
        eat();
        leftChopstick.release();
        System.out.println("Philosopher " + id + " releases left chopstick.");
        rightChopstick.release();
        System.out.println("Philosopher " + id + " releases right chopstick.");
      }
    }

    void eat() {
        try {
        	Random rand = new Random();
			int randTime = rand.nextInt(10) + 1;
        	System.out.println("Philosopher " + id + " is eating for " + randTime + " milli seconds.");
			Thread.sleep(randTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

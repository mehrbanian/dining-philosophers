import java.util.concurrent.Semaphore;

public class Chopstick {
    public Semaphore sem = new Semaphore(1);

    void grab() {
    	try {
			sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    void release() {
    	sem.release();
    }
}

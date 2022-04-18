import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane extends Thread{

    private int a, b;
    private Semaphore semaphore;

    public Dane(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        semaphore.release();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

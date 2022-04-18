import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread{
    private int suma;
    private Dane dane;
    private Semaphore semaphore;

    public Obliczenia(Dane dane, Semaphore semaphore) {
        this.dane = dane;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int a, b;
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a = dane.getA();
        b = dane.getB();
        suma = a + b;
        System.out.println("Wynik sumowania = " +suma);
    }
}

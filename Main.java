import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore semafor = new Semaphore(0);
        Dane dane = new Dane(semafor);
        Obliczenia obliczenia = new Obliczenia(dane, semafor);
        System.out.println("Lecimy");

        dane.start();
        obliczenia.start();
    }
}
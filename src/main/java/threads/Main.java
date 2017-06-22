package threads;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {


        DoTick doTickA = new DoTick("A thread");
        DoTick doTickB = new DoTick("B thread");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(doTickA);
        executor.submit(doTickB);
    }
}

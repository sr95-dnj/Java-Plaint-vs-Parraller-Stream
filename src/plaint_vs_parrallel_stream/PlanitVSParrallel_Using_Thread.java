package plaint_vs_parrallel_stream;

import java.util.stream.IntStream;

public class PlanitVSParrallel_Using_Thread {
    public static void main(String[] args) {
        IntStream.range(1,100).forEach(x->{
            System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + x);
        });
        System.out.println("=========================");
        IntStream.range(1,100).parallel().forEach(x->{
            System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + x);
        });
    }
}

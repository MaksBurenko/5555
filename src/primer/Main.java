package primer;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(pseudoRandomStream(13));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> (x*x/10) % 1000);
    }
}

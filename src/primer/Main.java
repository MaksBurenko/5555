package primer;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream.of(seed)
                .map(x -> {
                    for (int i = 0; i > -1; i++) {
                        if (i != 0) {
                            x = x * x;
                        }
                    }
                    return x;
                })
        return IntStream.forEachOrdered(x ->mid(x));
    }

    public static int mid(int x) {
        String numbers = Integer.toString(x);
        String finalNumber = "";

        char[] strToArray = numbers.toCharArray();

        for (int i = 0; i < strToArray.length; i++) {
            if (i > 1 && i < 5) {
                finalNumber = finalNumber + x;
            }
        }
        int fN = Integer.parseInt(finalNumber);
        return fN;
    }
}

package data;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberList {
    static Random random = new Random();

    public static List<Integer> getRandomNumberList(int count, int origin, int bound) {
        return random.ints(count, origin, bound)
                .boxed()
                .collect(Collectors.toList());
    }
    public static List<Integer> getRandomNumberList(int count) {
        return random.ints(count,1,100)
                .boxed()
                .collect(Collectors.toList());
    }
}

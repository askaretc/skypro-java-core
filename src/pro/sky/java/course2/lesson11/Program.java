package pro.sky.java.course2.lesson11;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> randomIntegerList = new Random().ints(Integer.MIN_VALUE, Integer.MAX_VALUE)
                .limit(10).boxed().collect(Collectors.toList());
        Stream<Integer> integerStream = randomIntegerList.stream();
        System.out.println(randomIntegerList);
        findMinMax(
                integerStream,
                Integer::compareTo,
                (x, y) -> System.out.println("minimal element: " + x + "\n" + "maximal element: " + y));
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        Optional<T> min = list.stream().min(order);
        Optional<T> max = list.stream().max(order);
        if (list.size() > 0) {
            minMaxConsumer.accept(min.get(), max.get());
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}

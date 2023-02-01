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


        ////////// Task 1 //////////
        System.out.println("\nTask 1:");
        findMinMax(
                integerStream,
                Integer::compareTo,
                (x, y) -> System.out.println("minimal element: " + x + "\n" + "maximal element: " + y));

        ////////// Task 2 //////////
        System.out.println("\nTask 2:");
        printAllEvenNumbers(randomIntegerList);
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

    public static void printAllEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbersList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        if (evenNumbersList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(evenNumbersList.size()).append(" even numbers were found:").append("\n");
            for (Integer num : evenNumbersList) {
                sb.append(num).append("\n");
            }
            String s = sb.toString();
            System.out.println(s);
        } else {
            System.out.println("Even numbers were not found.");
        }
    }
}

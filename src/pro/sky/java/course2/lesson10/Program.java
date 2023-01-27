package pro.sky.java.course2.lesson10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {
    public static void main(String[] args) {

        ////////// Task 1 //////////
        System.out.println("Task 1:");

        // Anonymous class
        Predicate<Integer> valuePredicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(valuePredicate1.test(10));

        // Lambda
        Predicate<Integer> valuePredicate2 = x -> x > 0;
        System.out.println(valuePredicate2.test(-7));


        ////////// Task 2 //////////
        System.out.println("\nTask 2:");

        // Anonymous class
        Consumer<String> nameConsumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s + "!");
            }
        };
        nameConsumer1.accept("Johnny");

        // Lambda
        Consumer<String> nameConsumer2 = s -> System.out.println("Hello, " + s + "!");
        nameConsumer2.accept("Jack");


        ////////// Task 3 //////////
        System.out.println("\nTask 3:");

        // Anonymous class
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function1.apply(299792.458));

        // Lambda
        Function<Double, Long> function2 = aDouble -> Math.round(aDouble);
        System.out.println(function2.apply(9.80665));


        ////////// Task 4 //////////
        System.out.println("\nTask 4:");

        Random random = new Random();

        // Anonymous class
        Supplier<Integer> randomSupplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return random.nextInt(100);
            }
        };
        System.out.println(randomSupplier1.get());

        // Lambda
        Supplier<Integer> randomSupplier2 = () -> random.nextInt(100);
        System.out.println(randomSupplier1.get());


        ////////// Task 5 //////////
        System.out.println("\nTask 5:");

        /* При помощи метода ternaryOperator реализуем функциональный интерфейс Function,
        * который принимает на вход число любого типа, и в случае если оно положительное,
        * то возвращается его округленный вариант типа Long. Если же число отрицательное,
        * то возвращается его округленный вариант типа Long по модулю. */

        Double num = -111.111;

        Predicate<Number> condition = x -> x.longValue() > 0;
        Function<Number, Long> ifTrue = x -> Long.valueOf(Math.round(x.longValue()));
        Function<Number, Long> ifFalse = x -> Long.valueOf(Math.abs(Math.round(x.longValue())));

        Function<Number, Long> result = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(result.apply(num));
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}

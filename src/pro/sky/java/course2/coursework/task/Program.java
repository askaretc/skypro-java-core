package pro.sky.java.course2.coursework.task;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import static java.util.Map.Entry.comparingByKey;

public class Program {

    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            check = false;
            System.out.print("Text: ");
            String inputText = new Scanner(System.in).nextLine();
            if (inputText.isBlank()) {
                System.out.println("Please enter something.");
                check = true;
            } else {
                printInformationAboutInputText(inputText);
            }
        }
    }

    public static void printInformationAboutInputText(String inputText) {
        System.out.printf("\nThere are %s words in the text\n", countWordsInText(inputText));
        System.out.println("TOP10: ");
        printTopTenCommonWords(inputText);
    }

    private static long countWordsInText(String inputText) {
        Stream<String> inputTextStream = new ArrayList<>(List.of(inputText.split("[\\s,.!]+"))).stream();
        return inputTextStream.count();
    }

    private static void printTopTenCommonWords(String inputText) {
        Stream<String> inputTextStream = new ArrayList<>(List.of(inputText.split("[\\s,.!]+"))).stream();
        Map<String, Long> topTenWordsMap = inputTextStream
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        topTenWordsMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(comparingByKey()))
                .limit(10)
                .forEach(System.out::println);
    }
}

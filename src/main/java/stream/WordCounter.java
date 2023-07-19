package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounter {
    static void run(ArrayList<String> words) {
        try {
            Map<Integer, List<String>> classifiedWords = words.stream()
                    .collect(Collectors.groupingBy(String::length));

            classifiedWords.forEach((length, wordList) -> {
                System.out.print("{");
                wordList.forEach(word -> System.out.print(word + ","));
                System.out.println("}");
            });
            System.out.println("___________________________________________");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
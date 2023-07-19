package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class WordLength {
    static void run(ArrayList<String> words) {
        try {
            ConcurrentHashMap<Integer, List<String>> classifiedWords = (ConcurrentHashMap<Integer, List<String>>) words.parallelStream()
                    .collect(Collectors.groupingByConcurrent(String::length));

            classifiedWords.forEach((length, wordList) -> {
                System.out.print("Words With " + length + " Lengths: ");
                wordList.forEach(word -> System.out.print(word + ","));
                System.out.println();
            });
            System.out.println("___________________________________________");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

package stream;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("amir");
        words.add("rahim");
        words.add("mahdi");
        words.add("mojtaba");
        words.add("mohammad");
        words.add("ali");
        words.add("taher");
        words.add("reza");
        words.add("mohsen");
        WordCounter.run(words);
        WordLength.run(words);
    }
}

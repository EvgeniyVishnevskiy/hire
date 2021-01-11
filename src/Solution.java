import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        List<String> arguments = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (String arg : args) {
            if (arg.startsWith("\\-")) {
                arguments.add(arg);
            } else {
                map.put(arg, null);
            }
        }

        List<String> allStrings = new ArrayList<>();
        long totalWords = 0L;

        if (!arguments.isEmpty()) {
            for (String arg : arguments) {
                if (arg.startsWith("\\-S=")) {
                    String substring = arg.substring(3);
                    String[] stopWords = substring.split(",");
                    Set<String> set = Set.of(stopWords);
                } else {
                    //todo for chars
                }
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String fileString = Files.readString(Path.of(entry.getKey()));
                allStrings.add(fileString);
                entry.setValue(fileString);
                List<String> words = List.of(fileString.split(" "));\
                words.stream().filter(it -> )
                totalWords += countOfWords;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        long totalWords = allStrings.stream().mapToLong(s -> s.split(" ").length).reduce(0, Long::sum);
        allStrings.forEach(file -> {
                    int length = file.split(" ").length;
                    System.out.println(length);
                }
        );

        System.out.println(entry.getKey() + "the count of words is: " + countOfWords);

        System.out.println("The total amount of words is: " + totalWords);
    }


}

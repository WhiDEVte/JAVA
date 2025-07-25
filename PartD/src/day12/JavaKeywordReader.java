package day12;

import java.io.*;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
class JavaKeyWord {
    private String keyword;
    private String korean;
    private int level;

    @Override
    public String toString() {
        return keyword + "," + korean + "," + level;
    }
}

public class JavaKeywordReader {
    public static List<JavaKeyWord> loadKeywords(String filePath) {
        List<JavaKeyWord> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                list.add(new JavaKeyWord(parts[0], parts[1], Integer.parseInt(parts[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

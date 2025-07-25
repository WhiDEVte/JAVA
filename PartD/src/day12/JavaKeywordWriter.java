package day12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JavaKeywordWriter {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
            "public,공용의,1",
            "private,사적인,1",
            "list,목록,1",
            "immutable,불변의,3",
            "static,정적인,2"
        );
        try (FileWriter writer = new FileWriter("java_keyword.csv")) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("CSV 파일 저장 완료.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

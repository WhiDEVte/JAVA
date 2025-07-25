package day12;

import java.io.FileWriter;
import java.io.IOException;

public class JavaKeywordAppender {
    public static void main(String[] args) {
        JavaKeyWord k1 = new JavaKeyWord("final", "최종의", 1);
        JavaKeyWord k2 = new JavaKeyWord("construct", "건설하다", 2);

        try (FileWriter writer = new FileWriter("java_keyword.csv", true)) {
            writer.write(k1.toString() + "\n");
            writer.write(k2.toString() + "\n");
            System.out.println("객체 추가 완료.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

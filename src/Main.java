import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        int ball = 0;
        double srball = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("F://java//Nightfile//text.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0] + " " + parts[1];
                int score = Integer.parseInt(parts[2]);
                if (score < 3) {
                    students.add(name);
                }
                ball += score;
            }
        } catch (IOException e) {
            System.out.println("fdgd");
        }
        srball = (double) ball / students.size();

        System.out.println("Ученики с оценкой меньше 3 баллов:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("Средний балл по классу: " + srball);
    }
}
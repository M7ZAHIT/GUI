package GUI07.StudentGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br =
                    Files.newBufferedReader(Path.of("D:/Ders Belgeleri/2nd semester/2021/GUI/StudentList.txt"))){
            br.lines().map(line -> {
                String[] values = line.split(" ");
               return new Student(values[0],values[1],Integer.parseInt(values[2]));

            }).collect(Collectors.groupingBy(Student::getGroup)).entrySet()
                    .stream().forEach(enty-> System.out.println(enty.getKey()+" "+ enty.getValue()));
        }catch (IOException e) {

        }
    }
}

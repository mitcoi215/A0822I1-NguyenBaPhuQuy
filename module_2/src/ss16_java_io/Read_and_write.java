package ss16_java_io;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read_and_write {
    public static void main(String[] args) {
        final String sourcePath = a;//Users/nguyenbaphuquy/Documents/codegym/A0822I1-NguyenBaPhuQuy/module_2/src/ss16_java_io/ReadAndWrite;
        final String targetPath = b;//Users/nguyenbaphuquy/Documents/codegym/A0822I1-NguyenBaPhuQuy/module_2/src/ss16_java_io/ReadAndWrite;
                List < String > text = new ArrayList<>();
        File sourcePath = new File(sourcePath);
        File targetPath = new File(targetPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(sourcePath);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
            }
            text.add(line);
            bufferedReader.close();
            fileReader.close();
            //write
            fileWriter = new FileWriter(targetPath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String element : text)
            {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
                bufferedWriter.close();
                fileWriter.close();
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}

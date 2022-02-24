package ZMyOwnClass.OperacjeNaPlikach;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTextFile {
    public static void main(String[] args) throws IOException {

        int numberToWrite = 1234567;
        String filePath = "test_text_file.txt";
        writeToTextFile(filePath, numberToWrite);
        System.out.println(readFromTextFile(filePath));
    }

    private static void writeToTextFile(String filePath, int number) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(number));
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    private static int readFromTextFile(String filePath) throws IOException {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String number = fileReader.readLine();
            return Integer.parseInt(number);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }




}

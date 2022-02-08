package Files.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {
    public static void main(String[] args) throws IOException {

//        zapisywania do pliku
        String str = "Tekst ółść";
        char chars[] = str.toCharArray();

        FileWriter fw = null;
        try {
            fw = new FileWriter("files\\fileWriter.txt");
            for (char c: chars ) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
    if(fw != null) fw.close();
        }

    }
}

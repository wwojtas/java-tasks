package Files.BufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MainBufferedInput {
    public static void main(String[] args)
            throws IOException {
        // odczyt z pliku
        BufferedInputStream in = null;

        try {
            in = new BufferedInputStream(new FileInputStream("test.txt"));
            int v = 0;
            while ((v = in.read()) != -1) {
                // kowertujemy na char - bo czytamy jakby plik był binarny
                System.out.print((char) v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }


    }
}

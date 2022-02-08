package Files.BufferedOutput;

import java.io.*;

public class MainBufferedOutput {
    public static void main(String[] args) throws IOException {

        // zapis do pliku

        BufferedOutputStream out = null;
        String str = "testowy string output";
        char chars[] = str.toCharArray();

        try {
            out = new BufferedOutputStream(new FileOutputStream("files\\fileOutputTest.txt"));
            int v = 0;
            for (char c :
                    chars) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}

package Files.FileOutputInputStreamExample;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainFileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Zapis do pliku
        char chars[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O'};
        FileOutputStream out = null;

        try{
            out = new FileOutputStream("test.txt");
            for (char c: chars){
                out.write(c);
            }
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }
}

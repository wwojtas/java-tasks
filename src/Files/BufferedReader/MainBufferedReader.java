package Files.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainBufferedReader {
    public static void main(String[] args)
            throws IOException {

        BufferedReader br = null;
        try{
        br = new BufferedReader(new FileReader("files\\multiline.txt"));
        String str = null;
        while ( (str = br.readLine()) != null )
            System.out.println(str);
        } catch (IOException e) {

        } finally {
            if( br != null) br.close();
        }

    }
}

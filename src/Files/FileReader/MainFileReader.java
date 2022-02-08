package Files.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {
    public static void main(String[] args)
    throws IOException {

        // odczyt z pliku

        FileReader fr = null;

        try {
            int num;
            fr = new FileReader("files\\fileWriter.txt");
            while( ( num = fr.read()) != -1 ) {
                System.out.println( (char) num );
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fr != null) fr.close();
        }

    }
}

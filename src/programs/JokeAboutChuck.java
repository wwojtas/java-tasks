package programs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class JokeAboutChuck {
    public static void main(String[] args) {


        try{
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            // tworzymy input stream
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader( inputStreamReader );

            String line = "";
            while( (line = bufferedReader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

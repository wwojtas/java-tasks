package programowanieSieciowe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketDownloadWebpage {
    public static void main(String[] args)
    throws Exception {
        Socket socket = new Socket("duckduckgo.com", 80);
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())
        );
        bufferedWriter.write("GET / HTTP/1.0\n\n");
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(
          new InputStreamReader(socket.getInputStream())
        );

        String data; // dane odczytane z serwera
        while((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
        }

    }
}

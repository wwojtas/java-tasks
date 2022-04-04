package programowanieSieciowe;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleSocketServerJava {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(300);
        Socket socket = serverSocket.accept();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println("HTTP/1.1 200 OK");
        printWriter.println("Content-Type: text/html; charset=utf-8");
        printWriter.println("Connection: Keep-Alive");
        printWriter.println();

        System.out.println("Write text: ");
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while ( !(str = scanner.nextLine()).equals("exit") ){
            printWriter.println(str);
        }

        scanner.close();
        socket.close();
    }
}

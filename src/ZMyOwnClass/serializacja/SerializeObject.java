package ZMyOwnClass.serializacja;

import java.io.*;

public class SerializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        String name;


        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.bin"))) {
            outputStream.writeObject(Integer.valueOf(1));
            outputStream.writeObject(Integer.valueOf(2));
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.bin"))) {
            Integer number = (Integer) inputStream.readObject();
            System.out.println(number);
            number = (Integer) inputStream.readObject();
            System.out.println(number);
        }
    }
}

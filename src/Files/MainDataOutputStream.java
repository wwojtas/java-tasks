package Files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDataOutputStream {
    public static void main(String[] args) throws IOException {

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")));
            out.writeUTF("Testowy strumien binarny");
            out.writeShort(23000);
            out.writeLong(4654321321654L);
            out.writeFloat(45.56F);
            out.writeDouble(96846546.45D);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); // wymuszenie zapisu z bufora

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}

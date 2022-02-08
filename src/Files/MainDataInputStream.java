package Files;

import java.io.*;

public class MainDataInputStream {
    public static void main(String[] args) throws IOException {


        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")));
            String str = in.readUTF();
            System.out.println(str);
            // Ważne
            // kolejność odczytu musi być zgodna
            // z kolejnością jaka jest zapisana w pliku binarnym
            // Ważne
            short shortNum = in.readShort();
            System.out.println(shortNum);

            long longNum = in.readLong();
            System.out.println(longNum);

            float floatnum = in.readFloat();
            System.out.println(floatnum);

            double doubleNum = in.readDouble();
            System.out.println(doubleNum);

            Byte byteNum = in.readByte();
            System.out.println(byteNum);
;
            char charA = in.readChar();
            System.out.println(charA);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}

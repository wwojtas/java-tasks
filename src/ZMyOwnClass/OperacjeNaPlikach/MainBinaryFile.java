package ZMyOwnClass.OperacjeNaPlikach;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class MainBinaryFile {
        public static void main(String[] args) throws IOException {

            int numberToWrite = 1234567;

            String filePath = "test_binary_file.bin";
            writeToBinaryFile(filePath, numberToWrite);
            System.out.println(readFromBinaryFile(filePath));
        }

        private static void writeToBinaryFile(String filePath, int number) throws IOException {
            DataOutputStream outputStream = null;
            try {
                outputStream = new DataOutputStream(new FileOutputStream(filePath));
                outputStream.writeInt(number);
            } finally {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }

        private static int readFromBinaryFile(String filePath) throws IOException {
            DataInputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new FileInputStream(filePath));
                return inputStream.readInt();
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }


    }


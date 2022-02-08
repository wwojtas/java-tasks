package Files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MainFile {
    public static void main(String[] args)
            throws IOException {

    //    Klasa   File

        File file = new File("files\\testFile.txt");
        if( !file.exists() ) {
            boolean fileCreated = file.createNewFile();
            System.out.println("Wynik utworzenia pliku: " + fileCreated);
        } else {
            System.out.println("Plik już istnieje");

            // czy plik może być modyfikowany - czy można czytac plik?
            System.out.println("Czy mozna czytać plik: " +file.canRead());

            // czy mozna zapisać do pliku
            System.out.println("czy mozna zapisać do pliku: " + file.canWrite());

            System.out.println("Czy to zwykły plik: " + file.isFile());

            System.out.println("Czy plik jest katalogiem: " + file.isDirectory());

            System.out.println("Nazwa pliku: " + file.getName());

            System.out.println("Katalog w ktorym jest plik: " + file.getParent());

            System.out.println("Sciezka do pliku: " + file.getPath());
            System.out.println("Sciezka absolutna do pliku: " + file.getAbsolutePath());

            System.out.println("Plik ukryty: " + file.isHidden());

            long lastModified = file.lastModified();
            System.out.println("Modyfikowany: " + (new Date(lastModified)));

            System.out.println("Wielkosć pliku: " + file.length());
        }


        File filesDir = new File("files");
        if( filesDir.exists() ) {
            System.out.println("\n Lista plikow w katalogu files");
            String files[] = filesDir.list();
            for (String f : files) {
                System.out.println(f);
            }
        }

        // tworzenie katalogu
        File dir = new File("files\\test_dir");
        if( !dir.exists() ) {
            dir.mkdir();
        }




    }
}

package data.StringClass;

public class StringClass {
    public static void main(String[] args) {

        // wymiana łańcucha znaków
        String txt = "Hello World";
        txt = txt.replaceAll("World", "User");
        System.out.println(txt);

        // porównanie łańcuchów znaków
        String str = "text";
        String text = "text";
        System.out.println((str == text)); // true - porównujemy miejsce w pamięci a nie wartość

        String s1 = "Hello";
        String s2 = "He";
        String s3 = s2 + "llO";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        String tekst = "  Jedne ciag   ";
//        Kasowanie białych znaków na początku i na końcu łąńcucha
        String trimStr = tekst.trim();
//        Kasowanie białych znaków na początku łąńcucha
        String tekstStrpLeading = tekst.stripLeading();

//        Kasowanie białych znaków na końcu łąńcucha
        String tekstStripTrailing = tekst.stripTrailing();

        // repeat
        String str1= str.repeat(2);
        System.out.println(str1);
        // join
        // concat
        char arr[] =  str.toCharArray();
        System.out.println(arr);

//        Integer value = new Integer(123);
//        System.out.println(value.toString());



    }
}

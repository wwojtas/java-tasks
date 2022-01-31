package data.StringBuilder;

public class MainStringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        // - append()
        builder.append("hello world").append(" -test. ");
        builder.append(-10);
        System.out.println(builder.toString());

        // - insert
        builder.insert(6, "my ");
        System.out.println(builder.toString());

        // - delete
        builder.delete(builder.indexOf("-test."), 21); // skad - dokad
        System.out.println(builder.toString());


    }
}

package ZMyOwnClass.TryWithResources;

import java.lang.AutoCloseable;

public class HtmlTag implements AutoCloseable {

    private String str;

    public HtmlTag(String str) {
        this.str = str;
        System.out.println(str);
    }

    public void body(String tekst) {
        System.out.println(tekst);
    }

    @Override
    public void close() {
        System.out.println("</" + str + ">");

    }

    public static void main(String[] args) {

        try(
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em")
            )
        {
            em.body("moj tekst");
        }

    }
}

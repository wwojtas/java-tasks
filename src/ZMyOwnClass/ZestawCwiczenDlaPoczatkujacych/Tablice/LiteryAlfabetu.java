package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Tablice;

public class LiteryAlfabetu {

    public String[] getFirst5LettersAlphabet(){

        String[] str5LetterAlphabet = new String[5];

        for (int i = 0; i < 5; i++) {
            str5LetterAlphabet[i] += ((char) (i + 'a'));
        }
        return str5LetterAlphabet;
    }

    public static void main(String[] args) {

        LiteryAlfabetu literyAlfabetu = new LiteryAlfabetu();
        String[] tab =  literyAlfabetu.getFirst5LettersAlphabet();

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }



}

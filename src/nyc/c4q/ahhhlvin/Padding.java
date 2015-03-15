package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Padding {
    public static void main(String[] args) {
        System.out.println(pad("Accesscode", 15, '_'));

    }


    public static String pad( String words, int count, char symbol) {


        /*
        int filler = count - words.length();
        String text = "";

        text += words;


        for (int i = 0; i < filler; i++) {
            text += symbol;
        }

        return text;



        // OR
*/
        return words + repeatChar(symbol, count - words.length());


    }

    public static String repeatChar(char text, int count) {

        String repChar = "";



        for (int i = 0; i < count; i++) {
            repChar += text;
        }

        return repChar;
    }
}

package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ifElsePad {
    public static void main(String[] args) {

        System.out.println(pad("Accesscode", 15, '+', true));


    }


    public static String pad(String words, int count, char symbol, boolean value) {

        String padding = repeatChar(symbol, count - words.length());

        if (value == true) {
            return padding + words;
        } else {
            return words + padding;
        }

    }




    public static String repeatChar(char text, int count) {

        String repChar = "";



        for (int i = 0; i < count; i++) {
            repChar += text;
        }

        return repChar;
    }

}

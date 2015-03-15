package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ifElsePad {
    public static void main(String[] args) {


        // code for 'pad' method
        System.out.println(pad("Accesscode", 15, '+', true));




        // code for 'substring' method
        String text = "Wassup Access Code.";
        System.out.println(substring(text, 7, 13));
        System.out.println(substring(text, 4, 14));
        /***** includes first index position, but excludes the end index position *****/
    }


    public static String pad(String words, int count, char symbol, boolean left) {

        String padding = repeatChar(symbol, count - words.length());

        if (left) {
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


    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; ++i){
            result += text.charAt(i);
        }
        return result;
    }


    public static String substring(String text, int start) {
        return substring(text, start, text.length());
        // this would work and print out everything in 'text' because it includes the first position '0', but does not include the '13' from .length because it only reads as '12'
    }




}

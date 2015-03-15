package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Repeat {
    public static void main(String[] args) {



        /* Exercise 1 */
        System.out.println(repeat("Hello, world!", '='));


        /* Exercise 2 */
        System.out.println(repeatChar('n', 8));



    }


    //*********************************************************//
    //*********************************************************//
    //*********************************************************//
    //*********************************************************//



    public static String repeat(String text, char symbol) {

        String word = "";

        System.out.println(text);

        for (int i = 0; i < text.length(); i++) {
            word += symbol;
        }

        return word;
    }


    public static String repeatChar(char text, int count) {

        String repChar = "";



        for (int i = 0; i < count; i++) {
            repChar += text;
        }

        return repChar;
    }








}

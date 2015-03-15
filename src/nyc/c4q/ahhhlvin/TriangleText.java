package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class TriangleText {
    public static void main(String[] args) {

        // printTriangle exercise
        printTriangle("Hello!");



        // printRevTriangle exercise
        printRevTriangle("Hello!");



    }


    public static void printTriangle(String word) {

        for (int i = 1; i <= word.length(); i++) {
           System.out.println(word.substring(0, i));
        }

    }




    // moving beginning index, 'i'
    public static void printRevTriangle(String word) {

        for (int i = 0; i < word.length(); i++) {
            System.out.println(repeatChar(' ', i) + word.substring(i));
            // progressively adds more empty spaces with each 'i' increment of +1 with each loop

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

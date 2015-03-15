package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class boxPrint {
    public static void main(String [] args ){

        boxWord("Hello, world!");

    }



    public static String repeatChar(char text, int count) {

        String repChar = "";



        for (int i = 0; i < count; i++) {
            repChar += text;
        }

        return repChar;
    }


    public static void boxWord(String words) {

        String finalWord = "+";
        finalWord += repeatChar('-', (words.length()+2));  // '+ 2' to print out 2 extra dashes to make up for the spaces before the first '|' and after the second '|'
        finalWord += "+";





        System.out.println(finalWord);

        System.out.println("| " + words + " |");

        System.out.println(finalWord);


    }

}




package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class reverseString {
    public static void main(String[] args ) {

        System.out.println(reverse("Hello, world!"));

    }


    public static String reverse(String word) {

        int stringLength = word.length();
        String revWord = "";

        for (int i = (stringLength-1); i >= 0; i--) {  // length must be -1 because we technically start from '0' so the length is actually '12', not the '13' positions .length() reads of 'word'
            revWord += word.charAt(i);

        }




        return revWord;   // replaces the declaration of 'reverse("Hello, world!")'
    }




}


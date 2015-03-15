package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class SwapHalves {
    public static void main(String[] args) {

        System.out.println(swapHalves("Hello, world!"));
    }

    public static String swapHalves(String text) {
        int midpoint = text.length() / 2;
        return text.substring(midpoint) + text.substring(0, midpoint);
    }


}

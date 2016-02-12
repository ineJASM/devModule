import java.util.Scanner;

/**
 * Created by Jasmine on 13/02/2016.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        oneAst one = new oneAst();
        straightLine st = new straightLine(i);

        System.out.println("Now Printing One Asterisk!");
        one.oneMeth();
        st.createLine();

        scan.close();
    }
}

import java.util.Scanner;

/**
 * Created by Jasmine on 13/02/2016.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number of asterisks to print in the horizontal line:");
        int intST = scan.nextInt();

        System.out.println("Please input number of asterisks to print in the vertical line:");
        int intVT = scan.nextInt();


        oneAst one = new oneAst();
        straightLine st = new straightLine(intST, intVT);

        System.out.println("Now Printing One Asterisk!");
        one.oneMeth();
        System.out.println();

        System.out.println("Now Printing " + intST +" Asterisks in a horizontal line");
        st.horizontalLine();
        System.out.println();

        System.out.println("Now Printing " + intVT +" Asterisks in a vertical line");
        st.verticalLine();
        System.out.println();

        scan.close();
    }
}

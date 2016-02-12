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

        System.out.println("Please input the height of the right triangle:");
        int intRT = scan.nextInt();

        System.out.println("Please input height of the triangle:");
        int intNRT = scan.nextInt();


        OneAst one = new OneAst();
        StraightLine st = new StraightLine(intST, intVT);
        RightTriangle rT = new RightTriangle(intRT);
        NotRT nRT = new NotRT(intNRT);

        System.out.println("Now Printing One Asterisk!");
        one.oneMeth();

        System.out.println("Now Printing " + intST +" Asterisks in a horizontal line");
        st.horizontalLine();

        System.out.println("Now Printing " + intVT +" Asterisks in a vertical line");
        st.verticalLine();

        System.out.println("Now Printing right triangle of height " + intRT);
        rT.printTriangle();

        System.out.println("Now Printing triangle of height " + intNRT);
        nRT.printTriangle();

        scan.close();
    }
}

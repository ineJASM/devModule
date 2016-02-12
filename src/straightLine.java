/**
 * Created by Jasmine on 13/02/2016.
 */

import java.util.Scanner;

public class straightLine {

    int i;
    int h;
    int j;

    public straightLine(int width, int height){
        this.i = width;
        this.h = height;
    }

    public void horizontalLine(){

        for(j = 0; j < i; j++){
            System.out.print("*");
        }
    }

    public void verticalLine(){
        for(j = 0; j < h; j++){
            System.out.println("*");
        }
    }
}

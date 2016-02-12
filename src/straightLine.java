/**
 * Created by Jasmine on 13/02/2016.
 */


public class StraightLine {

    int i;
    int h;
    int j;

    public StraightLine(int width, int height){
        this.i = width;
        this.h = height;
    }

    public void horizontalLine(){

        for(j = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void verticalLine(){
        for(j = 0; j < h; j++){
            System.out.println("*");
        }
    }
}

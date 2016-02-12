/**
 * Created by Jasmine on 13/02/2016.
 */
public class RightTriangle {

    int i, j, k;

    public RightTriangle(int height){
        this.i = height;
    }

    public void printTriangle(){
        for(j = 0; j < i; j++){
            //System.out.print("*");
            for(k = 0; k < j+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

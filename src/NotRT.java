/**
 * Created by Jasmine on 13/02/2016.
 */
public class NotRT {

    int i, j , k, l;

    public NotRT(int height){
        this.i = height;
    }

    public void printTriangle(){

        for(j = 0; j < i; j++){
            //spaces before asterisk
            for(k = 0; k < i-j; k++){
                System.out.print(" ");
            }
            for(l = 0; l < j * 2 + 1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

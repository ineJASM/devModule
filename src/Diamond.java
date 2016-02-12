/**
 * Created by Jasmine on 13/02/2016.
 */
public class Diamond {

    int i, j, k, l;

    public Diamond(int height){
        this.i = height;
    }

    public void printDiamond(){
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

        for(j = i-2; j >= 0; j--){
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

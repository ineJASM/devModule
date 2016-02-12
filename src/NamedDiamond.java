/**
 * Created by Jasmine on 13/02/2016.
 */
public class NamedDiamond {

    int i, j, k, l;

    public NamedDiamond(int height){
        this.i = height;
    }

    public void printDiamond(){
        for(j = 0; j < i-1; j++){
            //spaces before asterisk
            for(k = 0; k < i-j; k++){
                System.out.print(" ");
            }
            for(l = 0; l < j * 2 + 1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Jasmine");
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


/**
 * Created by Jasmine on 13/02/2016.
 */
public class PrimeCalc {

    int j=0, k=0;

    public PrimeCalc(int num){
        //this.i = num;
    }



    private static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if (n != 2 && n % 2 == 0) {
            System.out.println(n + " is not a prime factor");
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0){
                System.out.println(n + " is not a prime factor");
                return false;
            }
        }
        return true;

    }
    //ALMOST WORKING
    public static void calculateFactors(int num){
        int i = num;
        int j=0, k=0, counter = 0;

        //divide by all numbers smaller than given number
        //if numbers are prime then add to list
        for(j=1; j <= i; j++){
            k = i/j;
            System.out.println("k is " + k);
            if(isPrime(k)){
                counter++;
                //System.out.println("Prime factor " + counter + " is " + k);
            }
        }

    }
}

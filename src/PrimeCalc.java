import java.util.ArrayList;
import java.util.*;
/**
 * Created by Jasmine on 13/02/2016.
 */
public class PrimeCalc {

    public PrimeCalc(){}

    private static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;

    }

    public static void generate(int num){
        List primeList = new ArrayList<>();
        int j, k;

        //divide by all numbers smaller than given number
        //if numbers are prime then add to list
        for(j=1; j <= num; j++){

            k = num%j; // issues with this number

            if((k == 0) && isPrime(j)){
                if(primeList.contains(j)) {
                    break;
                }
                else {
                    primeList.add(j);
                }
            }
        }
        System.out.print("Your factors for " + num +" are : ");
        for(j = 0; j < primeList.size(); j++) {
            System.out.print(primeList.get(j) + " ");
        }

    }
}

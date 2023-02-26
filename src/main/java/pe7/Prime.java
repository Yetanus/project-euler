package pe7;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Prime {
    public boolean isPrime(int value){
        int counter =0;
        for (int i = 1; i <= value; i++) {
            if(i/value==0){
                counter++;
            }
        }
        if (counter==2){
            return true;
        }
        else return false;
    }

    public int countPrimes(int value){
        Set<Integer> primes = new HashSet<>(10001);
        Integer findMax =0;
        for (int i = 0; i < value; i++) {
            if (isPrime(i)){
                primes.add(i);
            }
            findMax = primes.stream()
                    .max(Comparator.comparing(Integer::valueOf))
                    .get();
        }
        return findMax;
    }


}

package pe3;


// euler3
public class Main {
    public static void main(String[] args) {
        long numm = 600851475143l;
        long largestFactor = 0l;
        long[] factors = new long[2];

        for (int i = 2; i*i < numm; i++) {
            if(numm % i == 0) {
                factors[0] =i;
                factors[1] = numm /i;
                for (int j = 0; j < 2; j++) {
                    boolean isPrime = true;
                    for (int k = 2; k*k < factors[j]; k++) {
                        if(factors[j] % k == 0){
                            isPrime = false;
                            break;
                        }

                    }
                    if(isPrime && factors[j] > largestFactor){
                        largestFactor = factors[j];
                    }

                }
            }
            System.out.println(largestFactor);
        }

    }
}

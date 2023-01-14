package pe6;

public class SumSquareDiff {
    public int calculateHowMany(int value){
        int howMany =1;
        do{
            howMany++;
        }while(howMany+1 !=value);
        return howMany;
    }
    public int calculateSumOfSquares(int value){
        int sum =0;
        for (int i=0; i<=value; i++){
            sum +=i*i;
        }
        return sum;
    }

    public double calculateSquareSum(int value){
        int squareSum=0;
        for (int i = 0; i <=value ; i++) {
            squareSum +=i;
        }
        return Math.pow(squareSum,2);
    }

    public int findDiff(int value){
        System.out.println((int)calculateSquareSum(value)-calculateSumOfSquares(value));
        return (int)calculateSquareSum(value)-calculateSumOfSquares(value);
    }

}

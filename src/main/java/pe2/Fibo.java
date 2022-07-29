package pe2;

public class Fibo {


    public void count(int value){
        int sum=0;
        int x =1;
        int y =2;
        while (x<= value){
            if(x %2 == 0)
                sum +=x;
                int z = x+y;
                x=y;
                y=z;
            }
        System.out.println(sum);
        }

    }


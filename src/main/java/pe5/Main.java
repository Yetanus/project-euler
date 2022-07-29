package pe5;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        streamNumbers();
    }

    public static Stream<Long> randomStream(int range) {
        return Stream.generate(Math::random).
                map(n -> n * range).
                map(Math::round);
        //todo

    }

    public static void streamNumbers(){
        randomStream(10).
                limit(10).
                forEach(System.out::println);
    }
}

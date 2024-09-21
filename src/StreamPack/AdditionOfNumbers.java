package StreamPack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdditionOfNumbers {
    public static void main(String[] args){
        int i = 35263;

        int sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}

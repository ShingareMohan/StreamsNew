package StreamPack;

import java.util.stream.IntStream;

public class add1 {
    public static void main(String[] args){
        int sum = IntStream.range(1, 11).sum();

        System.out.println(sum);
    }
}

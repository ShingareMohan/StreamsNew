package StreamPack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Even1 {
    public static void main(String[] args){
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);

    }
}

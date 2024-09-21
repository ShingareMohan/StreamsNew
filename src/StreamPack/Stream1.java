package StreamPack;

import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args){
        Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream.count());
    }
}

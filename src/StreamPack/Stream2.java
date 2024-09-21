package StreamPack;

import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args){
        Stream<Stream2> SingleElement = Stream.of(new Stream2());
        Stream<Stream2> SingleElement1 = Stream.of(new Stream2());

        System.out.println(SingleElement.count());
        System.out.println(SingleElement1.count());

        Stream<Integer> StremOfNumber = Stream.of(2,3,4,52);
        System.out.println(StremOfNumber.count());
    }
}

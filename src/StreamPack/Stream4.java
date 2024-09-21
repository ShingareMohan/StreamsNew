package StreamPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args){
       List<Integer> numbers1 = Arrays.asList(1,1,5,4,2,2,4,5);
       List<Integer> UniqueNumbers = numbers1.stream().distinct().collect(Collectors.toList());
       System.out.println(UniqueNumbers);
    }
}

package StreamPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMin1 {
    public static void main(String[] args){
        {
            int i = 15623;

            Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

            System.out.println(sumOfDigits);
        }
}}

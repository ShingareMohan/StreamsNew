package StreamPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> listOfIntegers1 = listOfIntegers.stream().filter(e -> e%5==0).collect(Collectors.toList());
        System.out.println(listOfIntegers1);//.forEach(System.out::println);
    }

    }

package StreamPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int Max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        int Min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println(Max);
        System.out.println(Min);


    }
}

package StreamPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 43, 6, 8, 55, 21, 24, 27, 44);

        List<Integer> EvenList = list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println(EvenList);

        List<Integer> OddList = list1.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println(OddList);

    }
}

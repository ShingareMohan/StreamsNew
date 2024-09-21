package StreamPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args){
        List<Integer> list4 = Arrays.asList(3,5,6,8,7,9);

        List<Integer> n = Collections.singletonList(list4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
       System.out.println(n);
    }
}

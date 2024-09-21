package StreamPack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Uniqueele {
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
     Set<Integer> UnuniqueEle  = new HashSet<>();
     Set<Integer> duplicateElements = (Set<Integer>) listOfIntegers.stream().filter(str1 -> !UnuniqueEle.add(str1)).collect(Collectors.toList());
    }
}

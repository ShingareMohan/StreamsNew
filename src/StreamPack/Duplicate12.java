package StreamPack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate12 {
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> UniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = listOfIntegers.stream().filter(i -> !UniqueElements.add(i)).collect(Collectors.toSet());
         System.out.println(duplicateElements);
    }
}

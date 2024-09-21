package StreamPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLength {
    public static void main(String[] args){
        List<String> s1 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> s2 = s1.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(s2);
    }
}

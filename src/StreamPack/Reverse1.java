package StreamPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Reverse1 {
    public static void main(String[] args){
        String str = "Java is fun";

        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);
    }
    }

package StreamPack;
import java.util.*;
import java.util.stream.Collectors;

public class Duplicate21 {
    public static void main(String[] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(inputString);

        Set<String> uniqueChars = new HashSet<>();
       // System.out.println(uniqueChars);

//        Set<String> duplicateChars =
//                Arrays.stream(inputString.split(""))
//                        .filter(ch -> ! uniqueChars.add(ch))
//                        .collect(Collectors.toSet());
//
//        System.out.println(duplicateChars);
    }
}

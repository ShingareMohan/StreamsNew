package StreamPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsDigit {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String>  listOfStrings1 = listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
        System.out.println(listOfStrings1);
    }
}

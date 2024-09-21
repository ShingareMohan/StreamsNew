package StreamPack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repeat {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementsCountMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        boolean mostFrequentElement = elementsCountMap.entrySet().add((Map.Entry<String, Long>) Map.Entry.comparingByValue());
        System.out.println(mostFrequentElement);



    }
}

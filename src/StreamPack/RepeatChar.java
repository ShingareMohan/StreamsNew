package StreamPack;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;


public class RepeatChar {
    public static void main(String[] args){
        String InputString = "Java is fun programming";

        Map<Character,Long> CharCountMap = (Map<Character, Long>) InputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(CharCountMap);
    }
}

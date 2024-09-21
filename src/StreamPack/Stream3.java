package StreamPack;

import java.util.*;

public class Stream3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Rohan");
        list.add("Mohan");
        list.add("Angad");
        list.add("Nisha");
        list.add("Venkatesh");
        list.add("Chandrakant");
        list.add("Rohan");
        list.add("Angad");

        // list.stream().forEach(System.out::println);
       // list.stream().filter((String list1)->list1.length()>5).forEach(System.out::println);
        //list.stream().distinct().forEach(System.out::println);
        //list.stream().limit(4).forEach(System.out::println);
      //  list.stream().skip(1).forEach(System.out::println);
        //list.stream().map(String::length).forEach(System.out::println);
       // list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted((String name1, String name2)->name2.length() - name1.length()).forEach(System.out::println);
        //int sum = Arrays.stream(new int[] {1,3,2,5,4,3,7}).reduce((a, b) -> a+b).getAsInt();
        //System.out.println(sum);
        //OptionalInt min = Arrays.stream(new int[] {3,4,6,3,2,4,6,1}).min();
       // System.out.println(min);
        //OptionalInt max = Arrays.stream(new int[] {5,3,6,8,9,4}).max();
        //System.out.println(max);

      // long numberOfBigNames = list.stream().filter((String list4)->list4.length()>5).count();
     // System.out.println(numberOfBigNames);
       // if(list.stream().anyMatch((String name)->name.length()==5));
      //  {
      //      System.out.println("Yes there are names with 5 alphabets");
      //  }
//    boolean result = list.stream().allMatch((String name1)->name1.length()>5);
//        System.out.println(result);
//        {
//            System.out.println("Big names are");
//        }
//        long s = list.stream().filter((String name4)->name4.length()>5).count();
//         System.out.println(s);
       //boolean result = list.stream().noneMatch((String name5)->name5.length()==2);
     //  System.out.println(result);
//        {
//            System.out.println("There is no two letter name");
//        }
       // Optional<String> element = list.stream().findAny();
       // System.out.println(element);

        Optional<String> longestString = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestString);
    }
}

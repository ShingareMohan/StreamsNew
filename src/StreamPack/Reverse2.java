package StreamPack;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse2 {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9};

        int[] reverseArray = IntStream.rangeClosed(1,a.length).map(i -> a[a.length-i]).toArray();

        System.out.println(Arrays.toString(reverseArray));
    }
}

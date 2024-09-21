package StreamPack;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DistinctSort {
    public static void main(String[] args){
        int a[] = {4, 2, 5, 1};
        int b[] = {8, 1, 9, 5};

        int c[] = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));
    }

    }

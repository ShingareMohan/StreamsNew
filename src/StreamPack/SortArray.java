package StreamPack;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArray {
    public static void main(String[] args){
        int a[] = {4,2,7,1};
        int b[] = {8,3,9,5};

        int c[] = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}

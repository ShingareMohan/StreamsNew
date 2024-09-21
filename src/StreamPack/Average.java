package StreamPack;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args){
    int A[] = {1,2,4,2,6,8,9};
    int sum = Arrays.stream(A).sum();
    System.out.println(sum);
    double Avg = Arrays.stream(A).average().getAsDouble();
    System.out.println(Avg);
    }
}

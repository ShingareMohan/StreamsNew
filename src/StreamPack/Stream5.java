package StreamPack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream5 {
    int i;
    String date;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Stream5(String date, int i) {
    }

    public static void main(String[] args){
        List<Stream5> list = Arrays.asList(
                new Stream5("2022-01-01",100),
                new Stream5("2022-01-01",200),
                new Stream5("2022-01-01",300),
                new Stream5("2022-01-01",400)


        );
        Map<String,Integer> SumByDay = list.stream().collect(Collectors.groupingBy(Stream5::getDate,Collectors.summingInt(Stream5::getI)));

    }
}

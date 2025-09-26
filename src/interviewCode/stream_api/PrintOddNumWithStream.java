package interviewCode.stream_api;

import java.util.Arrays;
import java.util.List;

public class PrintOddNumWithStream {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,4,6,3,7,8,9,10,11,13,16);

     // numList.stream().filter( n -> n % 2 !=0).forEach(System.out::println);

        List<Integer> newList = numList.stream().filter(n -> n % 2 != 0).toList();
        newList.forEach(System.out::println);

    }
}
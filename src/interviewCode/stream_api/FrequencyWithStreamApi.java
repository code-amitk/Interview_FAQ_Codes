package interviewCode.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyWithStreamApi {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 2, 5, 3, 1);

        Map<Integer, Long> frequency =
                list.stream().collect( Collectors.groupingBy(n-> n, Collectors.counting()));

        frequency.forEach(( key, value) ->
        System.out.println("Number : " + key + " Frequency :" + value)
                );
    }
}

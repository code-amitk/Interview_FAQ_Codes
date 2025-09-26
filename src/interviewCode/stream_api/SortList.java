package interviewCode.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

    static void sort() {

        List<Integer> list = Arrays.asList(1,2,5,3,4,7,6);

        System.out.println( "Sorted List ASC :" );
       list.stream().sorted().toList().forEach(System.out::println);
        List<Integer> newList = list.stream().sorted().toList();
        System.out.println( "Sorted List Reverse:" );

     list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
    }
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class client {

    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(3,2,1,5,4,2,1,4,3);

        // Step 1, Convert to stream;
        Stream<Integer> s = arr.stream();

        // step 2 : do data manipulation
        // convert every number to its square
        s =  s.map(item -> item*item);
        List<Integer> listSquare = s.collect(Collectors.toList());

        System.out.println(listSquare);
    }
}

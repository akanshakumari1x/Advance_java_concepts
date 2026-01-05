import java.util.Arrays;
import java.util.List;

public class Example1 {
   /* Stream API is used to process collections in a functional, declarative, and
    lazy manner using filter, map, reduce, and collect operations.*/
    public static void main(String []arg){
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

//        stream() → creates stream
//        filter() → intermediate operation
//        forEach() → terminal operation



    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example1 {
   /* Stream API is used to process collections in a functional, declarative, and
    lazy manner using filter, map, reduce, and collect operations.*/

    public static void main(String []arg){
      // 1.  Print even numbers from a list

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

//        stream() → creates stream, filter() → intermediate operation, forEach() → terminal operation

     //  2. Get doubled even numbers into a new list
        List<Integer> result =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .toList();


      // 3. Find first number greater than 20
        Optional<Integer> value =
                numbers.stream()
                        .filter(n -> n > 20)
                        .findFirst();

        value.ifPresent(System.out::println);

        // 4. Flatten list of lists - Converts Stream<List<String>> → Stream<String>
        List<List<String>> data =
                List.of(List.of("Java", "Spring"),
                        List.of("SQL", "Docker"));

        data.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // 5. Find sum of number -Used for aggregation
        int sum =  numbers.stream()
                        .reduce(0, Integer::sum);






    }
}

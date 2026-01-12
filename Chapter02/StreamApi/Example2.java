import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

    public static void main(String arg[]){

       //1.  Iterate HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Docker");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        //2. Filter HashMap by key
        map.entrySet()
                .stream()
                .filter(e -> e.getKey() > 1)
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

       //3. Filter HashMap by Value
        map.entrySet()
                .stream()
                .filter(e -> e.getValue().startsWith("S"))
                .forEach(e -> System.out.println(e));

        //4. Convert array to List
        List<String> values =
                map.values()
                        .stream()
                        .toList();

        //5. Sort Hashmap by Key
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

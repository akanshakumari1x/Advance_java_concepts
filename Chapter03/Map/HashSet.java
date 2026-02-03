import java.util.Set;

public class HashSet {
    public static  void main(String arg[]) {

       // In your banking system project, suppose you want to store unique account numbers:
        Set<Integer> accountNumbers = new HashSet<>();

        accountNumbers.add(1001);
        accountNumbers.add(1002);
        accountNumbers.add(1001); // ignored
        System.out.println(accountNumbers.contains(1002)); // true
    }
}

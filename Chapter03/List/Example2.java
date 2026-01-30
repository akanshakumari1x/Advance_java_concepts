
import java.util.*;

public class Example2 {
    public static void main(String[] args) {

        List<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

        // Insert in middle (fast)
        playlist.add(1, "New Song");

        // Remove element
        playlist.remove("Song B");

        for(String song : playlist) {
            System.out.println(song);
        }
    }
}

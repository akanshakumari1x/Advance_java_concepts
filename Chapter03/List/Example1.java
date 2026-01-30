import java.util.*;

public class Example1 {
    public static void main(String arg[]){

                List<String> products = new ArrayList<>();

                products.add("Laptop");
                products.add("Mobile");
                products.add("Headphones");

                // Fast access using index
                System.out.println(products.get(1));  // Mobile

                // Update element
                products.set(2, "Smart Watch");

                // Loop
                for(String p : products) {
                    System.out.println(p);
                }
            }
        }



import java.lang.reflect.Field;

public class Example1 {


    // Getting class info here
    Class<?> c = Class.forName("java.lang.String");

    public Example1() throws ClassNotFoundException {

        System.out.println(c.getName());       // java.lang.String
        System.out.println(c.getMethods());
    }


    // Accessing private field Reflection can break encapsulation.
    class User {
        private String name = "Akansha";
    }

    User u = new User();
    Field f = u.getClass().getDeclaredField("name");
    f.setAccessible(true);  // bypass private
    System.out.println(f.get(u));  // Akansha


    //calling method dynamically
    
    Method m = u.getClass().getMethod("toString");
    Object result = m.invoke(u);
    System.out.println(result);








}

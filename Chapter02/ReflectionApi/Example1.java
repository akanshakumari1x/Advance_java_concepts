public class Example1 {

    Class<?> c = Class.forName("java.lang.String");

    public Example1() throws ClassNotFoundException {

        System.out.println(c.getName());       // java.lang.String
        System.out.println(c.getMethods());
    }


}

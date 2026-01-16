interface MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Example {
    public static void main(String [] args){
        int sum = MathUtil.add(10, 20);
        System.out.println(" sum "+ sum);


    }
}

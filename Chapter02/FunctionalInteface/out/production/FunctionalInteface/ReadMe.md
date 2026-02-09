\#Real-world Java Examples:-



1.Runnable is a functional interface.

new Thread(() -> System.out.println("Thread running")).start();



2.Without functional interface → separate Comparator class.

list.sort((a, b) -> a.getMarks() - b.getMarks());



3.Stream API.

list.stream()

&nbsp;   .filter(n -> n > 10)

&nbsp;   .forEach(System.out::println);



Behind the scenes:

Predicate

Consumer

Function ..all are functional interfaces





\##A lambda expression can be mapped to exactly ONE abstract method.

Ex:-

() -> System.out.println("Hello")



There is no method name, no class name, only parameters \& body.

So Java must know exactly which method this lambda represents.

If there is more than one abstract method, Java has no way to decide which one the lambda is implementing.

The compiler gets confused at compile time, not runtime.

Check below Example :- 



\#One abstract method → No confusion

@FunctionalInterface

interface Printer {

&nbsp;   void print();

}

Printer p = () -> System.out.println("Printing");

p.print();



Lambda → print().



\#Two abstract methods → Compiler is lost

interface Printer {

&nbsp;   void print();

&nbsp;   void scan();

}

Printer p = () -> System.out.println("Hello");

Compilation Error. bcz java has no clue is this lambda for print or for scan.





Important point: It’s NOT about runtime execution










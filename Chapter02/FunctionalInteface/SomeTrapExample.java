public class SomeTrapExample {
  // 1. Overloading vs Overriding (the BIGGEST confusion)
  class Parent {
      void show(Object o) {
          System.out.println("Parent Object");
      }
  }

    class Child extends Parent {
        void show(String s) {
            System.out.println("Child String");
        }
    }

    public class Test {
        public static void main(String[] args) {
            Parent p = new Child();
            p.show("Hello");
        }
    }
//o/p=> Parent Object  why?.
// This is overloading, NOT overriding
//Method selection happens at compile time
//Compiler checks reference type → Parent

 //2. Overriding + Overloading together
 class Parent {
     void show(Object o) {
         System.out.println("Parent Object");
     }
 }

    class Child extends Parent {
        @Override
        void show(Object o) {
            System.out.println("Child Object");
        }

        void show(String s) {
            System.out.println("Child String");
        }
    }

    public class Test {
        public static void main(String[] args) {
            Parent p = new Child();
            p.show("Hello");
        }
    }

    //o/p=> Child Object  why?
    //Compile-time → chooses show(Object)
    // Runtime → object is Child
    //Overridden method → Child Object

    //3. Static methods (method hiding)

    class Parent {
        static void show() {
            System.out.println("Parent static");
        }
    }

    class Child extends Parent {
        static void show() {
            System.out.println("Child static");
        }
    }

    public class Test {
        public static void main(String[] args) {
            Parent p = new Child();
            p.show();
        }
    }

    //o/p=> Parent static why?
    //Static methods are NOT overridden
    //They are hidden
    //Bound at compile time
    //Reference type decides

   //4. Variables are NOT polymorphic
   class Parent {
       int x = 10;
   }

    class Child extends Parent {
        int x = 20;
    }

    Parent p = new Child();
    System.out.println(p.x);

    //o/p=> 10. why?
    //Variables depend on reference type
    //Only methods support runtime polymorphism








}

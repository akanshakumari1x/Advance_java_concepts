 interface A {
        default void show() {
            System.out.println("A");
        }
    }

    interface B {
        default void show() {
            System.out.println("B");
        }
    }
        class DiamondProblemEx implements A, B {
            public void show() {
                A.super.show();   // choose A
            }
        }




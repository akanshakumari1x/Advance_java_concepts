
//Here only one object is being created for singleton class.

public class SingletonEx {

    private static SingletonEx instance;

    private SingletonEx() {}  // private constructor

    public static SingletonEx getInstance() {
        if(instance == null) {
            instance = new SingletonEx();
        }
        return instance;
    }
}


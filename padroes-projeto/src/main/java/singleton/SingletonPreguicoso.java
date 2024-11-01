package singleton;

public class SingletonPreguicoso {
    private static SingletonPreguicoso instance;

    private SingletonPreguicoso() {
        super();
    }
    public static SingletonPreguicoso getInstance() {
        if (instance == null) {
            instance = new SingletonPreguicoso();
        }
        return instance;
    }
}

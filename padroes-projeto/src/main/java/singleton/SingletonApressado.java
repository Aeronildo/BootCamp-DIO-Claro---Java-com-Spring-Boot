package singleton;

public class SingletonApressado {
    private static SingletonApressado instance = new SingletonApressado();

    private SingletonApressado() {
        super();
    }
    public static SingletonApressado getInstance() {

        return instance;
    }
}

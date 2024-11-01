package singleton;

public class SingletonPreguicosoHolder {

    private static class InstanceHolder {
        public static SingletonPreguicosoHolder instance = new SingletonPreguicosoHolder();
    }

    private SingletonPreguicosoHolder() {
        super();
    }
    public static SingletonPreguicosoHolder getInstance() {
        return InstanceHolder.instance;
    }

}

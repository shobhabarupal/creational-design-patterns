package creationalDesignPattern.singleton;

/**
 * This class uses eager initialization of creationalDesignPattern.singleton instance.
 */
public class EagerSingleton {

    private EagerSingleton() {

    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}

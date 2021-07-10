package creationalDesignPattern.singleton;

import java.io.Serializable;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazySingletonInnerClass implements Serializable {

    private LazySingletonInnerClass(){}

    private static class instance {
        static LazySingletonInnerClass INSTANCE = new LazySingletonInnerClass();
    }

    public static LazySingletonInnerClass getInstance() {
        return instance.INSTANCE;
    }
}

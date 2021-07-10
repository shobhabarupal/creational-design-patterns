package creationalDesignPattern.singleton;

/**
 * This class demonstrates creationalDesignPattern.singleton pattern using Double Checked Locking or "classic" creationalDesignPattern.singleton.
 * This is also a lazy initializing creationalDesignPattern.singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazySingletonWithSynchronization {

    private LazySingletonWithSynchronization() {}

    private static volatile LazySingletonWithSynchronization INSTANCE;

    public static LazySingletonWithSynchronization getInstance() {
        if (INSTANCE == null)
        {
            synchronized (LazySingletonWithSynchronization.class)
            {
                if (INSTANCE == null)
                {
                    INSTANCE = new LazySingletonWithSynchronization();
                }
            }
        }
        return INSTANCE;
    }
}

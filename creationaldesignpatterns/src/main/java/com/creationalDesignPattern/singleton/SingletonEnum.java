package creationalDesignPattern.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum is clean way to create a creationalDesignPattern.singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum SingletonEnum {

    INSTANCE;

    public void someMethod() {

    }
}

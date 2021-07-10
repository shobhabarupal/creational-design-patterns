package creationalDesignPattern.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();

        //precreate some objects in object pool.
        //another way of implementation is create object on demand.
        for(int i=0 ; i< count ; i++)
            availablePool.offer(creator.get());
    }

    public T get() {
        try {
            return availablePool.take(); //if not available then it waits indefinite time untill some object available
        }
        catch (InterruptedException e) {
            System.err.println("take() was interrupted");
        }

        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("put() was interrupted");
        }
    }

}

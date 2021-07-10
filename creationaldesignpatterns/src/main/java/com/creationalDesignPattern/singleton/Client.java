package creationalDesignPattern.singleton;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        LazySingletonInnerClass singleton;


        singleton = LazySingletonInnerClass.getInstance();
        LazySingletonInnerClass singleton2 = singleton;

        //System.out.println(creationalDesignPattern.singleton == singleton2);

        try {
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(singleton);
            out.close();

            // deserailize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            LazySingletonInnerClass instance2 = (LazySingletonInnerClass) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + singleton.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}

package creationalDesignPattern.factoryMethod;

public abstract class MessageCreator {


    //abstract method can perform some additional operations on the object return by the subclasses for eg - adding headers , encryption etc.
    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();
}

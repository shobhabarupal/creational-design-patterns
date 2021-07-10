package creationalDesignPattern.factoryMethod;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.getMessage();
        System.out.println(msg);
    }
}

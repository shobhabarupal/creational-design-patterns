package creationalDesignPattern.factoryMethod;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "text message";
    }
}

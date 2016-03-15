package lesson8.chat2.message;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class Message {
    private MessageType type = MessageType.MESSAGE;
    private String text;

    public Message(MessageType type, String text) {
        this.type = type;
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

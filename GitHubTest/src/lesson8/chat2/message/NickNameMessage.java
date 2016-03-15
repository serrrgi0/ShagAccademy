package lesson8.chat2.message;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class NickNameMessage extends Message {
    public NickNameMessage(String text) {
        super(MessageType.NICKNAME, text);
    }
}

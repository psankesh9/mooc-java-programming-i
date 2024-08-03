import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    public static void main(String[] args) {
        MessagingService service = new MessagingService();
        service.add(new Message("Sender1", "Hello World!"));
        service.add(new Message("Sender2", "This is a longer message that should not be added if it exceeds 280 characters."));
        for (Message msg : service.getMessages()) {
            System.out.println(msg);
        }
    }
}


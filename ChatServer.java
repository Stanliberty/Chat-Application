import java.util.ArrayList;
import java.util.List;

public class ChatServer implements ISend {
    private List<IReceiver> observers = new ArrayList<>();

    public void registerObserver(IReceiver receiver) {
        observers.add(receiver);
    }

    @Override
    public void sendMessage(String message, IReceiver sender) {
        for (IReceiver receiver : observers) {
            if (!receiver.equals(sender)) {
                receiver.receiveMessage(message, sender);
            }
        }
    }
}

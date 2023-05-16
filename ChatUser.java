import javax.swing.*;

public class ChatUser implements IReceiver, ISend {
    private String name;
    private ChatServer server;
    private ChatWindow chatWindow;

    public ChatUser(String name, ChatServer server) {
        this.name = name;
        this.server = server;
    }

    public void setChatWindow(ChatWindow chatWindow) {
        this.chatWindow = chatWindow;
    }

    @Override
    public void receiveMessage(String message, IReceiver sender) {
        chatWindow.displayMessage(sender.toString() + ": " + message);
    }

    @Override
    public void sendMessage(String message, IReceiver sender) {
        server.sendMessage(message, this);
        chatWindow.displayMessage(sender.toString() + ": " + message);
    }

    @Override
    public String toString() {
        return name;
    }
}

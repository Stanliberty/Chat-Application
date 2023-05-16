public class Main {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        ChatUser user1 = new ChatUser("Stanley", server);
        ChatUser user2 = new ChatUser("Michael", server);
        ChatUser user3 = new ChatUser("Bailey", server);

        server.registerObserver(user1);
        server.registerObserver(user2);
        server.registerObserver(user3);

        ChatWindow window1 = new ChatWindow(user1);
        ChatWindow window2 = new ChatWindow(user2);
        ChatWindow window3 = new ChatWindow(user3);

        user1.setChatWindow(window1);
        user2.setChatWindow(window2);
        user3.setChatWindow(window3);

        window1.display();
        window2.display();
        window3.display();
    }
}

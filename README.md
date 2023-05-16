# Chat-Application
This is a simple chat application that demonstrates the Observer design pattern. It consists of a ChatServer that sends messages to registered ChatUsers. Each ChatUser is both an IReceiver and an ISend, which allows them to receive and send messages.

## How to Compile and Run
To compile the files in Linux, follow these steps:
- Install Java if you don't have it already: sudo apt install default-jre
- Open a terminal and navigate to the directory where the files are located
- Compile the files using the following command: javac *.java
- Run the program with the following command: java Main

This will launch three ChatWindow instances representing three users: Stanley, Michael, and Bailey. They will be able to send messages to each other and see messages from others.

## Files
- ChatServer.java: Defines the ChatServer class, which implements the ISend interface and maintains a list of registered IReceiver observers. It sends messages to all registered observers except the sender.
- ChatUser.java: Defines the ChatUser class, which implements both the IReceiver and ISend interfaces. Each ChatUser has a name, a reference to the ChatServer, and a ChatWindow. It sends messages to the ChatServer and receives messages from other ChatUsers via the ChatServer. It also displays messages in its own ChatWindow.
- ChatWindow.java: Defines the ChatWindow class, which extends the JFrame class and provides a graphical user interface for sending and receiving messages. Each ChatWindow has a reference to a ChatUser and displays messages received by the ChatUser in a JTextArea. It also sends messages typed in a JTextField to the ChatUser via the ISend interface.
- IReceiver.java: Defines the IReceiver interface, which has a single method receiveMessage(String message, IReceiver sender). Classes that implement this interface can receive messages.
- ISend.java: Defines the ISend interface, which has a single method sendMessage(String message, IReceiver sender). Classes that implement this interface can send messages.
- Main.java: Defines the main class, which creates a ChatServer, three ChatUsers, and three ChatWindows. It registers the ChatUsers with the ChatServer and sets the ChatWindows for each ChatUser. It then displays the ChatWindows.

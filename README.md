# Chat-Application
This is a simple chat application that demonstrates the Observer design pattern. It consists of a ChatServer that sends messages to registered ChatUsers. Each ChatUser is both an IReceiver and an ISend, which allows them to receive and send messages.

## How to Compile and Run
To compile the files in Linux, follow these steps:
- Install Java if you don't have it already: sudo apt install default-jre
- Open a terminal and navigate to the directory where the files are located
- Compile the files using the following command: javac *.java
- Run the program with the following command: java Main

This will launch three ChatWindow instances representing three users: Stanley, Michael, and Bailey. They will be able to send messages to each other and see messages from others.


public interface IReceiver {
    void receiveMessage(String message, IReceiver sender);
}

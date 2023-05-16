import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private JTextArea chatTextArea;
    private JTextField inputTextField;
    private JButton sendButton;
    private ChatUser user;
    private static int x = 0;


    public ChatWindow(ChatUser user) {
        this.user = user;
        setTitle(user.toString());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set location of current ChatWindow frame slightly to the side
        setLocation(x, 80);
        x += 400; // Add 400 pixels to x-coordinate for next ChatWindow frame

        chatTextArea = new JTextArea();
        chatTextArea.setEditable(false);

        inputTextField = new JTextField();
        inputTextField.addActionListener(new InputTextFieldListener());

        sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        setLayout(new BorderLayout());
        add(new JScrollPane(chatTextArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputTextField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);
    }

    public void display() {
        setVisible(true);
    }

    public void displayMessage(String message) {
        chatTextArea.append(message + "\n");
    }

    private class InputTextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = inputTextField.getText();
            user.sendMessage(message, user);
            inputTextField.setText("");
        }
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = inputTextField.getText();
            user.sendMessage(message, user);
            inputTextField.setText("");
        }
    }
}

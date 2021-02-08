package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatWindow extends JFrame {

    public static void main(String[] args) {
        ChatWindow frame = new ChatWindow();
        frame.setVisible(true);
    }

    public ChatWindow() {

        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 600);
        setAlwaysOnTop(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextArea chat = new JTextArea();
        chat.setText("Say Hello");
        chat.setToolTipText("Окно чата");
        chat.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chat, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(10, 57, 946, 406);
        panel.add(scrollPane);


        JTextField nameFieldText = new JTextField();
        nameFieldText.setText("Enter your name");
        panel.add(nameFieldText, "North");

        JTextField sayFieldText = new JTextField();
        sayFieldText.setText("text");
        panel.add(sayFieldText, "South");

        //TODO TimeDateStamp
        sayFieldText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                StringBuilder sb = new StringBuilder();
                if ((e.getKeyCode() == 10) && (!sayFieldText.getText().equals(""))) {
                    sb.append(chat.getText())
                            .append(" \n " + nameFieldText.getText() + ":")
                            .append(sayFieldText.getText());
                    sayFieldText.setText("");
                    chat.setText(sb.toString());
                    sayFieldText.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        add(panel);


    }


}

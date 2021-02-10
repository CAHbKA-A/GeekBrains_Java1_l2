package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatWindow2 extends JFrame {

    public static void main(String[] args) {
        ChatWindow2 frame = new ChatWindow2();
        frame.setVisible(true);
    }

    public ChatWindow2() {

        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 600);
        setAlwaysOnTop(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
       // panel.setLayout(new BorderLayout(BoxLayout));



        JTextField nameFieldText = new JTextField();
        nameFieldText.setText("Enter your name");
      //  nameFieldText.setAlignmentX(JComponent.BOTTOM_ALIGNMENT);
        panel.add(nameFieldText);

        JTextArea chat = new JTextArea();
        chat.setText("Say Hello");
        chat.setToolTipText("Окно чата");
      //  chat.setAlignmentX(JComponent.TOP_ALIGNMENT);
        chat.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chat, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
         scrollPane.setBounds(10, 57, 946, 406);
        panel.add(scrollPane);


        JTextField sayFieldText = new JTextField();
      //  sayFieldText.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        sayFieldText.setText("text");
        panel.add(sayFieldText);
        sayFieldText.setMaximumSize(new Dimension(100, 600));

        JButton button1 = new JButton("send");
      //  button1.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        button1.setMaximumSize(new Dimension(100, 400));
        JButton button = new JButton("jghgj");
       // button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);

        panel.add(button1);


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

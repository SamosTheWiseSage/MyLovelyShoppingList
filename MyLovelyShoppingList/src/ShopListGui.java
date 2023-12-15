import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
public class ShopListGui implements ActionListener {
    public static JTextArea textArea;
    public static JTextArea textArea2;
    public static JPanel panel;
    public static JPanel panel2;
    public static JPanel panel3;
    public static JButton button;
    public static JButton button2;
    public static JButton button3;
    ShopListGui(){
        Borderlayout();


    }
    public void Borderlayout(){
        JFrame frame = new JFrame("RememberText");
        //sätter storlek på fönster
        frame.setSize(1000,1000);
        //bestäm vad som händer nar man stånger fönteret
        frame.setVisible(true);
         panel = new JPanel();
        //panel.setSize(100,100);
        //this is the panel section
        frame.add(panel);
        panel.setLayout(new BorderLayout());
        panel.setSize(500,500);
        textArea = new JTextArea(",byeyam,hello,helloworld");
        textArea.setSize(100,100);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
        System.out.println(textArea.getText());
        panel.add(textArea,BorderLayout.CENTER);

        button = new JButton("Show list");
        button.addActionListener(this);
        button.setSize(100,100);
        // button.setVisible(true);
        panel.add(button,BorderLayout.SOUTH);
        //end of first panel and start of panel 2
        panel2 = new JPanel();
       frame.add(panel2);
        panel2.setLayout(new BorderLayout());
        panel2.setSize(500,500);
        panel2.setBackground(Color.black);
        panel2.setVisible(false);
        textArea2 = new JTextArea("");

        panel2.add(textArea2,BorderLayout.CENTER);
        textArea2.setBackground(Color.cyan);
        button2 = new JButton("Start Game");
        button2.addActionListener(this::actionPerformed2);
        button2.setSize(100,100);
        panel2.add(button2,BorderLayout.SOUTH);
        //button 3
        button3 = new JButton();
        button3.addActionListener(this::actionPerformed3);
        button3.setSize(100,100);
        panel2.add(button3,BorderLayout.SOUTH);
        // end of panel 2 and start of panel3
        panel3 = new JPanel();
        frame.add(panel3);

        //frame closed is used as the known broder end
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getRequests("important.json");
       // panel.setEnabled(false);
        panel.setVisible(false);
      //  button.setEnabled(false);
        button.setVisible(false);
       // panel2.setEnabled(true);
       panel2.setVisible(true);
    }
    public void actionPerformed2(ActionEvent r) {
        Main.getRequests("important.json");
        button2.setVisible(false);
    }
    public void actionPerformed3(ActionEvent t) {
        Main.getRequests("important.json");
        button2.setVisible(false);
    }
}*/

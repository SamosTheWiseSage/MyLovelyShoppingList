import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ShoppingGuiForm implements ActionListener {
    private  JTextArea textArea1;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public ShoppingGuiForm(){
        JFrame frame = new JFrame("RememberText");
        //sätter storlek på fönster
        frame.setSize(1000,1000);
        //bestäm vad som händer nar man stånger fönteret
        frame.setVisible(true);
        panel1 = new JPanel();
        //panel.setSize(100,100);
        //this is the panel section
        frame.add(panel1);
        panel1.setLayout(new BorderLayout());
        panel1.setSize(500,500);
        textArea1 = new JTextArea
                ("Shoppinglist \nApples : 5\nCoke 2L : 4 \nKetchup : 3 \nPickles : 6 \nPineapple : 2 \nSkim-Milk : 4 \nWhole-Milk : 2 \nWineGums : 2");
        textArea1.setSize(100,100);
        textArea1.setFont(new Font("Arial",0,50));
        JScrollPane scrollPane = new JScrollPane(textArea1);
        panel1.add(scrollPane, BorderLayout.CENTER);
        System.out.println(textArea1.getText());
        panel1.add(textArea1,BorderLayout.CENTER);

        button1 = new JButton("Show list");
        button1.addActionListener(this);
        button1.setSize(100,100);
        // button.setVisible(true);
        panel1.add(button1,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getRequests("important.json");
        textArea1.setText("");
        /*textArea1.setText(String.valueOf(Main.response)
                .replaceAll("\"", "" )
                .replaceAll("\\{", "\n" )
                .replaceAll("\\}", "" )
                .replaceAll(",", "\n")
        );*/
        String[] split = Main.response.toString().replaceAll("\\{", "" )
                .replaceAll("\\}", "" ).replaceAll("\"", "" ).split(",");
        for (int i = 0; i < split.length ; i++) {
            int colpos = split[i].indexOf(":");
            System.out.println(colpos);
            split[i] = split[i].substring(0,colpos);
            textArea1.append(split[i] + "\n");
        }
        System.out.println(Arrays.toString(split));
        //textArea1.setText(String.valueOf(Main.response));
       button1.setVisible(false);
    }
}

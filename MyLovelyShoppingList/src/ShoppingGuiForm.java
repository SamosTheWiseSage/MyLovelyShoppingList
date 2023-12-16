import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ShoppingGuiForm implements ActionListener {
    String[] split;
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JLabel Label1;
    private JDialog dialog;
    public ShoppingGuiForm(){
        JFrame frame = new JFrame("RememberText");
        //sätter storlek på fönster
        frame.setSize(1000,1000);
      //  frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //bestäm vad som händer nar man stånger fönteret
        frame.setVisible(true);
        panel1 = new JPanel();
        //panel.setSize(100,100);
        //this is the panel section
        frame.add(panel1);
        panel1.setLayout(new BorderLayout());
        panel1.setSize(1000,1000);

       // textArea1 = new JTextArea("Shoppinglist \nApples : 5\nCoke 2L : 4 \nKetchup : 3 \nPickles : 6 \nPineapple : 2 \nSkim-Milk : 4 \nWhole-Milk : 2 \nWineGums : 2");
      //  textArea1.setSize(100,100);
        textArea1.setFont(new Font("Arial",0,50));
        //JScrollPane scrollPane = new JScrollPane(textArea1);
       // panel1.add(scrollPane, BorderLayout.CENTER);
        System.out.println(textArea1.getText());
        panel1.add(textArea1,BorderLayout.CENTER);
        //JPanel j = new JPanel( new FlowLayout());



        button1.setText("look here");
        button1.addActionListener(this);
        panel1.add(button1);
       // button1.setSize(100,100);
        // button.setVisible(true);
    //  panel1.add(button1,BorderLayout.SOUTH);
        //button number 1 starts here and button 2 start here
        button2.setText("send text");
        button2.addActionListener(this::actionPerformed2);
        //button2.setSize(100,100);
       // button2.setVisible(false);

        /*j.add(button1);
        j.add(button2);
        frame.add(j);*/

        //button 2 ends here and button 3 start here

            //timer and dialog box
        //dialogbox
        //frame.add(dialog);
        dialog = new JDialog(frame);
        dialog.setTitle("it begins with one");
        dialog.setVisible(true);
        dialog.setSize(200,200);
        dialog.add(button1,BorderLayout.SOUTH);
        JLabel BoxLabel = new JLabel("Welcom to the game press the button to begin.Beware you have limited time");
        dialog.add(BoxLabel,BorderLayout.CENTER);
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        //end of dialgobox
       panel1.add(Label1,BorderLayout.NORTH);
       Label1.setSize(50,50);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    int second = 7;
    public void Sec(){
        do {
            Label1.setText(String.valueOf(second));
            second-=1;

        } while (!(second == 0));{
            button1.doClick();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Sec();
        Main.getRequests("important.json");
        dialog.setVisible(false);
        textArea1.setText("");
        /*textArea1.setText(String.valueOf(Main.response)
                .replaceAll("\"", "" )
                .replaceAll("\\{", "\n" )
                .replaceAll("\\}", "" )
                .replaceAll(",", "\n")
        );*/
        split = Main.response.toString().replaceAll("\\{", "" )
                .replaceAll("\\}", "" ).replaceAll("\"", "" ).split(",");
        for (int i = 0; i < split.length ; i++) {
            int colpos = split[i].indexOf(":");
            System.out.println(colpos);
            split[i] = split[i].substring(0,colpos);
            textArea1.append(split[i] + "\n");
        }
        System.out.println(Arrays.toString(split));
        //textArea1.setText(String.valueOf(Main.response));
     //button1.setVisible(false);
       // panel1.remove(button1);
        panel1.add(button2,BorderLayout.SOUTH);
    }
    public void actionPerformed2(ActionEvent e){
        textArea1.append(split[1] + "8");
       //split[0].indent(Integer.parseInt("4"));
    }
}

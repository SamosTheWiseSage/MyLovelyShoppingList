import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class ShoppingGuiForm implements ActionListener {
    String[] split;
    private JTextArea textArea1;
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
    private JDialog dialog2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ShoppingGuiForm");
        frame.setContentPane(new ShoppingGuiForm().panel1);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1500, 1000);
    }
    int topic;
    public ShoppingGuiForm() {
        dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        dialog.setSize(1000, 550);
        dialog.setVisible(true);
        JButton b = new JButton("close");
        JTextArea dtext = new JTextArea("Welcome your challenge is to sort items by two diffrent orders one is alphabetical and one is by Highest number." +
                "\nin both of them the rules are the same. \n1: only one letter or number is allowed in any more then one letter or digit and you fail " +
                 "\nYour topic is ");
        dtext.setFont(new Font("Arial",0,20));
        dialog.add(dtext,BorderLayout.CENTER);
        dialog.add(b,BorderLayout.SOUTH);
        Random random = new Random();
       topic = random.nextInt(2);
        switch (topic) {
            case 0 -> {
                dtext.append("highest number");
            }
            case 1 -> {
                dtext.append("Alphabetical");
            }
        }
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        textArea1.setFont(new Font("Arial", 0, 20));
        textArea1.setText("Shoppinglist \nApples : 5\nCoke 2L : 4 \nKetchup : 3 \nPickles : 6 \nPineapple : 2 \nSkim-Milk : 4 \nWhole-Milk : 2 \nWineGums : 2");
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        Label1.setText("you have " + String.valueOf(tries) + "tries left");
        button1.addActionListener(this::actionPerformed); //THIS ONE IS FOR LABEL BUTTON.
        button2.addActionListener(this::actionPerformed2);
        button3.addActionListener(this::actionPerformed3);
        button4.addActionListener(this::actionPerformed4);
        button5.addActionListener(this::actionPerformed5);
        button6.addActionListener(this::actionPerformed6);
        button7.addActionListener(this::actionPerformed7);
        button8.addActionListener(this::actionPerformed8);
        button9.addActionListener(this::actionPerformed9);
    }

    int tries = 8;

    public void chance() {
        tries--;
        Label1.setText("you have " + String.valueOf(tries) + "tries left");
        //dialog box 2
        if (tries == 0){
            dialog2 = new JDialog();
            dialog2.setAlwaysOnTop(true);
            dialog2.setSize(350, 250);
            dialog2.setVisible(true);
            JButton b2 = new JButton("results");
            JTextArea dtext2 = new JTextArea("Congrats now lets see your Results. press the button below");
            dtext2.setFont(new Font("Arial",0,15));
            dialog2.add(dtext2,BorderLayout.CENTER);
            dialog2.add(b2,BorderLayout.SOUTH);
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   dialog2.dispose();
                    if (textField1.getText().equals("6") && topic == 0 || textField1.getText().equals("A") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField1.setBackground(Color.green);
                        textField1.setText(textField1.getText() + " was correct Nice!");
                    }else if (!textField1.getText().equals("6") && topic == 0 || !textField1.getText().equals("A") && topic == 1){
                        textField1.setBackground(Color.red);
                        textField1.setText(textField1.getText() + " WRONG");
                    } // END OF textfield1, textfield2 Start topic 1 is letter and topic 0 is number
                    if (textField2.getText().equals("5") && topic == 0 || textField2.getText().equals("C") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField2.setBackground(Color.green);
                        textField2.setText(textField2.getText() + " was correct Nice!");
                    }else if (!textField2.getText().equals("5") && topic == 0 || !textField2.getText().equals("C") && topic == 1){
                        textField2.setBackground(Color.red);
                        textField2.setText(textField2.getText() + " WRONG");
                    }
                    if (textField3.getText().equals("4") && topic == 0 || textField3.getText().equals("K") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField3.setBackground(Color.green);
                        textField3.setText(textField3.getText() + " was correct Nice!");
                    }else if (!textField3.getText().equals("4") && topic == 0 || !textField3.getText().equals("K") && topic == 1){
                        textField3.setBackground(Color.red);
                        textField3.setText(textField3.getText() + " WRONG");
                    }
                    if (textField4.getText().equals("4") && topic == 0 || textField4.getText().equals("P") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField4.setBackground(Color.green);
                        textField4.setText(textField4.getText() + " was correct Nice!");
                    } else if (!textField4.getText().equals("4") && topic == 0 || !textField4.getText().equals("P") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField4.setBackground(Color.red);
                        textField4.setText(textField4.getText() + " WRONG");
                    }
                    if (textField5.getText().equals("3") && topic == 0 || textField5.getText().equals("P") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField5.setBackground(Color.green);
                        textField5.setText(textField5.getText() + " was correct Nice!");
                    } else if (!textField5.getText().equals("3") && topic == 0 || !textField5.getText().equals("P") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField5.setBackground(Color.red);
                        textField5.setText(textField5.getText() + " WRONG");
                    }if (textField6.getText().equals("2") && topic == 0 || textField6.getText().equals("S") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField6.setBackground(Color.green);
                        textField6.setText(textField6.getText() + " was correct Nice!");
                    }else if (!textField6.getText().equals("2") && topic == 0 || !textField6.getText().equals("S") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField6.setBackground(Color.red);
                        textField6.setText(textField6.getText() + " WRONG");
                    }if (textField7.getText().equals("2") && topic == 0 || textField7.getText().equals("W") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField7.setBackground(Color.green);
                        textField7.setText(textField7.getText() + " was correct Nice!");
                    }else if (!textField7.getText().equals("2") && topic == 0 || !textField7.getText().equals("W") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField7.setBackground(Color.red);
                        textField7.setText(textField7.getText() + " WRONG");
                    }if (textField8.getText().equals("2") && topic == 0 || textField8.getText().equals("W") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField8.setBackground(Color.green);
                        textField8.setText(textField8.getText() + " was correct Nice!");
                    }else if (!textField8.getText().equals("2") && topic == 0 || !textField8.getText().equals("W") && topic == 1){
                        System.out.println("THIS WORKS");
                        textField8.setBackground(Color.red);
                        textField8.setText(textField8.getText() + " WRONG");
                    }


                   if (topic == 0) {
                        textArea1.append(" \nPickles : 6 \nApples : 5\nCoke 2L : 4 \nSkim-Milk : 4 \nKetchup : 3 \nPineapple : 2 \nWhole-Milk : 2 \nWineGums : 2");
                    } else if (topic == 1) {
                       textArea1.append("\nA\nC\nK\nP\nP\nS\nW\nW");
                   }

                }
            });}
    }
//START THE GAME and the actionpreform of button1
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getRequests("important.json");
        // dialog.setVisible(false);
        textArea1.setText("");
        /*textArea1.setText(String.valueOf(Main.response)
                .replaceAll("\"", "" )
                .replaceAll("\\{", "\n" )
                .replaceAll("\\}", "" )
                .replaceAll(",", "\n")
        );*/
        split = Main.response.toString().replaceAll("\\{", "")
                .replaceAll("\\}", "").replaceAll("\"", "").split(",");
        for (int i = 0; i < split.length; i++) {
            int colpos = split[i].indexOf(":");
            System.out.println(colpos);
            split[i] = split[i].substring(0, colpos);
            textArea1.append(split[i] + "\n");
        }
        System.out.println(Arrays.toString(split));
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        button9.setVisible(true);
    }
    public void actionPerformed2(ActionEvent t) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField1.getText());
        } else if (tries >= 0) {
            textArea1.append("\n"+textField1.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button2.setEnabled(false);
    }
    public void actionPerformed3(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField2.getText());
        } else if (tries >= 0) {
            textArea1.append("\n"+textField2.getText());
            textArea1.append("\nnow lets compare your sorting with the true list");
        }
        button3.setEnabled(false);

    }
    public void actionPerformed4(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField3.getText());
        } else if (tries >= 0) {
            textArea1.append("\n"+textField3.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button4.setEnabled(false);
    }
    public void actionPerformed5(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField4.getText());
        } else if (tries == 0) {
            textArea1.append("\n"+textField4.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button5.setEnabled(false);
    }
    public void actionPerformed6(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField5.getText());
        } else if (tries == 0) {
            textArea1.append("\n"+textField5.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button6.setEnabled(false);
    }
    public void actionPerformed7(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField6.getText());
        } else if (tries == 0) {
            textArea1.append("\n"+textField6.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button7.setEnabled(false);
    }
    public void actionPerformed8(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField7.getText());
        } else if (tries == 0) {
            textArea1.append("\n"+textField7.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button8.setEnabled(false);
    }
    public void actionPerformed9(ActionEvent e) {
        chance();
        if (tries >= 1) {
            textArea1.append("\n"+textField8.getText());
        } else if (tries == 0) {
            textArea1.append("\n"+textField8.getText());
            textArea1.append("\n now lets compare your sorting with the true list");
        }
        button9.setEnabled(false);
    }
}

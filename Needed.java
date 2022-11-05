/**
 * Author :- WhoAmI?
 * Level : 2
 * Team - Dillusioners
 * Word - Needed
 * Info - Everyone needs a calculator in life and a gui one is even better
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Packages necessary imported
public class Needed implements ActionListener {
    //Initialising GUI placeholders in code
    JFrame C_Frame = new JFrame("Calculator");
    JTextField C_text_field = new JTextField();
    JButton[] C_num_buttons = new JButton[10];
    JButton[] C_func_buttons = new JButton[9];
    JButton C_add = new JButton("+"), C_sub = new JButton("-"), C_mul = new JButton("*"), C_div  = new JButton("/"), C_clear = new JButton("AC"), C_del = new JButton("Del"), C_decimal = new JButton("."), C_equal = new JButton("="),C_Perc = new JButton("%");
    JPanel C_Panel = new JPanel();
    Font C_font = new Font("Ink Free",Font.BOLD,25);

    double C_a = 0, C_b = 0;
    char C_oper;
    //Creating a constructor to initialise the objects
    Needed()
    {   //Configuring The Frame
        C_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        C_Frame.setSize(500,500);
        C_Frame.setLayout(null);
        //Configuring Text Field
        C_text_field.setBounds(45,50,400,40);
        C_text_field.setFont(C_font);
        C_text_field.setEditable(false);
        //Configuring Function Buttons
        C_func_buttons[0] = C_add;
        C_func_buttons[1] = C_sub;
        C_func_buttons[2] = C_mul;
        C_func_buttons[3] = C_div;
        C_func_buttons[4] = C_clear;
        C_func_buttons[5] = C_del;
        C_func_buttons[6] = C_decimal;
        C_func_buttons[7] = C_equal;
        C_func_buttons[8] = C_Perc;
        //Adding all number and function buttons to the afore made arrays and giving them necessary attributes
        for(int i = 0; i < 9; i++){
            C_func_buttons[i].addActionListener(this);
            C_func_buttons[i].setFont(C_font);
            C_func_buttons[i].setFocusable(false);
        }
        for(int i = 0; i < 10; i++){
            C_num_buttons[i] = new JButton(String.valueOf(i));
            C_num_buttons[i].addActionListener(this);
            C_num_buttons[i].setFont(C_font);
            C_num_buttons[i].setFocusable(false);
        }
        // Configuring stuff NOT part of the JPanel
        C_clear.setBounds(45,100,94,50);
        C_del.setBounds(149,100,91,50);
        C_Perc.setBounds(253,100,91,50);
        C_div.setBounds(353,100,91,50);

        //Configuring the JPanel
        C_Panel.setBounds(45,150,400,300);
        C_Panel.setLayout(new GridLayout(4,4,10,10));
        C_Panel.setBackground(Color.CYAN);
        //Appending stuff which is part of the JPanel
        C_Panel.add(C_num_buttons[7]);
        C_Panel.add(C_num_buttons[8]);
        C_Panel.add(C_num_buttons[9]);
        C_Panel.add(C_mul);
        C_Panel.add(C_num_buttons[4]);
        C_Panel.add(C_num_buttons[5]);
        C_Panel.add(C_num_buttons[6]);
        C_Panel.add(C_sub);
        C_Panel.add(C_num_buttons[1]);
        C_Panel.add(C_num_buttons[2]);
        C_Panel.add(C_num_buttons[3]);
        C_Panel.add(C_add);
        C_Panel.add(C_func_buttons[6]);
        C_Panel.add(C_num_buttons[0]);
        C_Panel.add(C_func_buttons[7]);
        C_Panel.add(C_equal);
        //Finally adding stuff to the JFrame and this marks the end of object initialisation in  the constructor
        C_Frame.add(C_clear);
        C_Frame.add(C_del);
        C_Frame.add(C_Perc);
        C_Frame.add(C_div);
        C_Frame.add(C_text_field);
        C_Frame.add(C_Panel);
        C_Frame.setVisible(true);
    }
    //Just a normal main method
    public static void main(String[] args) {
        Needed calc = new Needed();
    }
    //The heart of the program the Action Listener Method
    @Override
    public void actionPerformed(ActionEvent e) {
        //Various Arithmetic Functions and stuff
        for(int i = 0; i < 10; i++ ) {
            if (e.getSource() == C_num_buttons[i])
                C_text_field.setText(C_text_field.getText().concat(String.valueOf(i)));
        }
            if(e.getSource() == C_decimal)
                C_text_field.setText(C_text_field.getText().concat("."));

        if(e.getSource() == C_add){
                C_a = Double.parseDouble(C_text_field.getText());
                C_oper = '+';
                C_text_field.setText("");
            }
        if(e.getSource() == C_sub){
            C_a = Double.parseDouble(C_text_field.getText());
            C_oper = '-';
            C_text_field.setText("");
        }
        if(e.getSource() == C_mul){
            C_a = Double.parseDouble(C_text_field.getText());
            C_oper = '*';
            C_text_field.setText("");
        }
        if(e.getSource() == C_div){
            C_a = Double.parseDouble(C_text_field.getText());
            C_oper = '/';
            C_text_field.setText("");
        }
        if(e.getSource() == C_equal){
            C_b = Double.parseDouble(C_text_field.getText());
            switch (C_oper) {
                case '+' -> C_text_field.setText(String.valueOf(C_a + C_b));
                case '-' -> C_text_field.setText(String.valueOf(C_a - C_b));
                case '*' -> C_text_field.setText(String.valueOf(C_a * C_b));
                case '/' -> C_text_field.setText(String.valueOf(C_a / C_b));
            }
        }
        if(e.getSource() == C_clear)
            C_text_field.setText("");
        if(e.getSource() == C_del){
            String string = C_text_field.getText();
            C_text_field.setText("");
            for(int i=0; i<string.length()-1;i++)
                C_text_field.setText(C_text_field.getText()+string.charAt(i));
        }
        if(e.getSource() == C_Perc){
            C_a = Double.parseDouble(C_text_field.getText());
            C_text_field.setText(String.valueOf(C_a/100));
        }
    }//Program done
}
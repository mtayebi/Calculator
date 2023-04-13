import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    JFrame jFrame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] operationButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton, clrButton, eqButton, dotButton, delButton;
    JPanel panel;

    Font myfont = new Font("Ink Free", Font.BOLD, 30);
    double num1 = 0 , num2 = 0, result = 0;
    char operator;

    Calculator(){
        // build our frame for putting components
        jFrame = new JFrame("Calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 550);
        jFrame.setResizable(false);
        jFrame.setLayout(null);

        // put operation show window into frame
        textField = new JTextField();
        textField.setBounds(50, 25, 500, 50);
        textField.setFont(myfont);
        textField.setEditable(false);



        // define and configure buttons to the frame
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        clrButton = new JButton("C");
        eqButton = new JButton("=");
        delButton = new JButton("del");
        dotButton = new JButton(".");

        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;
        operationButtons[4] = clrButton;
        operationButtons[5] = eqButton;
        operationButtons[6] = delButton;
        operationButtons[7] = dotButton;

        for (int number = 0; number < operationButtons.length; number++) {
            operationButtons[number].addActionListener(this);
            operationButtons[number].setFont(myfont);
            operationButtons[number].setFocusable(false);
        }

        for (int number = 0; number < numberButtons.length; number++) {
            numberButtons[number] = new JButton(String.valueOf(number));
            numberButtons[number].addActionListener(this);
            numberButtons[number].setFont(myfont);
            numberButtons[number].setFocusable(false);
        }

        // define clear and delete button for adding to frame
        clrButton.setBounds(50, 400, 100, 50);
        delButton.setBounds(450, 400, 100, 50);


        //define panel
        panel = new JPanel();
        panel.setBounds(50, 100, 500, 250);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(Color.gray);

        // add buttons to panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(operationButtons[0]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(operationButtons[1]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(operationButtons[2]);
        panel.add(operationButtons[3]);
        panel.add(numberButtons[0]);
        panel.add(operationButtons[7]);
        panel.add(operationButtons[5]);






        jFrame.add(panel);
        jFrame.add(textField);
        jFrame.add(clrButton);
        jFrame.add(delButton);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
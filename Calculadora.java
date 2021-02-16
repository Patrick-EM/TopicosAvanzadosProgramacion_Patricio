import javax.swing.*;

public class Calculadora {

    public static void main(String args[]){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 250);
        frame.setTitle("Calculadora Grafica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel num1Label = new JLabel("Primer Numero");
        num1Label.setBounds(50, 20, 100, 25);
        panel.add(num1Label);

        JTextField num1Text = new JTextField();
        num1Text.setBounds(170, 20, 165, 25);
        panel.add(num1Text);

        JLabel num2Label = new JLabel("Segundo Numero");
        num2Label.setBounds(50, 50, 100, 25);
        panel.add(num2Label);

        JTextField num2Text = new JTextField();
        num2Text.setBounds(170, 50, 165, 25);
        panel.add(num2Text);

        JButton buttonAdd = new JButton("Suma");
        buttonAdd.setBounds(25, 110, 150, 25);
        panel.add(buttonAdd);

        JButton buttonSub = new JButton("Resta");
        buttonSub.setBounds(216, 110, 150, 25);
        panel.add(buttonSub);

        JButton buttonDiv = new JButton("Division");
        buttonDiv.setBounds(25, 150, 150, 25);
        panel.add(buttonDiv);

        JButton buttonmul = new JButton("Multiplicacion");
        buttonmul.setBounds(216, 150, 150, 25);
        panel.add(buttonmul);

        frame.setVisible(true);
    }
}

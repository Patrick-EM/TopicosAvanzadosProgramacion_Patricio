import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener{
    private Container c;
    private JLabel label1, label2;
    private JTextField textF1, textF2;
    private JButton sum, res, mul, div;
    private JLabel resultado;

    Frame (){
        setTitle("Calculadora");
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Primer Numero");
        label1.setBounds(25, 20, 100, 20);
        c.add(label1);

        textF1 = new JTextField();
        textF1.setBounds(135, 20, 100, 20);
        c.add(textF1);

        label2 = new JLabel("Segundo Numero");
        label2.setBounds(25, 50, 100, 20);
        c.add(label2);

        textF2 = new JTextField();
        textF2.setBounds(135, 50, 100, 20);
        c.add(textF2);

        sum = new JButton("Suma");
        sum.setBounds(15, 100, 115, 30);
        c.add(sum);

        res = new JButton("Resta");
        res.setBounds(153, 100, 115, 30);
        c.add(res);

        mul = new JButton("Multiplicacion");
        mul.setBounds(15, 160, 115, 30);
        c.add(mul);

        div = new JButton("Division");
        div.setBounds(153, 160, 115, 30);
        c.add(div);

        resultado = new JLabel("Resultado: ");
        resultado.setBounds(15, 220, 150, 20);
        c.add(resultado);

        sum.addActionListener(this);
        res.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sum) {
            int n1 = Integer.parseInt(textF1.getText());
            int n2 = Integer.parseInt(textF2.getText());
            double r = n1+n2;
            resultado.setText("Resultado: " + r);
        }else if(e.getSource()==res){
            int n1 = Integer.parseInt(textF1.getText());
            int n2 = Integer.parseInt(textF2.getText());
            double r = n1-n2;
            resultado.setText("Resultado: " + r);
        }else if(e.getSource()==mul){
            int n1 = Integer.parseInt(textF1.getText());
            int n2 = Integer.parseInt(textF2.getText());
            double r = n1*n2;
            resultado.setText("Resultado: " + r);
        }else{
            int n1 = Integer.parseInt(textF1.getText());
            int n2 = Integer.parseInt(textF2.getText());
            double r = n1/n2;
            resultado.setText("Resultado: " + r);
        }
    }
}

public class Calculadora {
    public static void main(String args[]){
        Frame frame = new Frame();
    }
}

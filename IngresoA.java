import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresoA extends JPanel implements ActionListener{

    private JButton btnIngresar, btnCancelar;
    private JTextField txtUser;
    private JPasswordField txtcontraseña;

    public IngresoA(){
      setLayout(null);
      JLabel lblUser = new JLabel("Ususario", JLabel.RIGHT);
      lblUser.setBounds(10, 20, 80, 25);
      txtUser = new JTextField();
      txtUser.setBounds(100, 20, 165, 25);
      add(lblUser);
      add(txtUser);

      JLabel lblcontraseña = new JLabel("Contraseña", JLabel.RIGHT);
      lblcontraseña.setBounds(10, 50, 80, 25);
      txtcontraseña = new JPasswordField();
      txtcontraseña.setToolTipText("Ingrese Cotraseña");
      txtcontraseña.setBounds(100, 50, 165, 25);
      add(lblcontraseña);
      add(txtcontraseña);

      btnIngresar = new JButton("Ingresar");
      btnIngresar.setBounds(140, 90, 100, 25);
      btnIngresar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.setBounds(25, 90, 100, 25);
      btnCancelar.addActionListener(this);

      add(btnIngresar);
      add(btnCancelar);

    }

    public void actionPerformed(ActionEvent e){
        String usuario = txtUser.getText();
        String contraseña = new String(txtcontraseña.getPassword());

        if (e.getSource() == btnIngresar){
         if (usuario.isEmpty() && contraseña.isEmpty()) {
             JOptionPane.showMessageDialog(null, "Ingrese Nombre de ususario y contraseña");
             txtUser.requestFocus();
         }else{
             if (usuario.equals("1") && contraseña.equals("2")){
                JOptionPane.showMessageDialog(null, "Bienvenido a la agenda");
                JFrameDatos datos = new JFrameDatos();
             }else{
                 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas", "WARNING", JOptionPane.WARNING_MESSAGE);
                 txtUser.setText(null);
                 txtcontraseña.setText(null);
                 txtUser.requestFocus();
             }
         }
        }
       if (e.getSource() == btnCancelar){
           System.exit(0);
       }
    }
}

/*public class GUICoolness implements ActionListener {


    public static void main(String args[]){

        contenedor = new JFrame();
        JPanel panel = new JPanel();
        contenedor.setSize(300, 200);
        contenedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contenedor.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField usertext = new JTextField();
        usertext.setBounds(100, 20, 165, 25);
        panel.add(usertext);

        passwordLabel = new JLabel("Pasword");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        password = new JPasswordField();
        password.setBounds(100, 50, 165, 25);
        panel.add(password);

        buttonLogIn = new JButton("Login");
        buttonLogIn.setBounds(140, 90, 80, 25);
        buttonLogIn.addActionListener(new GUI());
        panel.add(buttonLogIn);

        successLabel = new JLabel("");
        successLabel.setBounds(140, 120, 300, 25);
        panel.add(successLabel);

        contenedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userLabel.getText();
        String password = passwordLabel.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Emmanuel") && password.equals("123456")){
            successLabel.setText("Login Successful!!");
        }else{
            successLabel.setText("Login Unsuccessful!!");
        }

    }
}

*/
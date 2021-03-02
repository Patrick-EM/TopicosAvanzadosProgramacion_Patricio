import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatos extends JPanel implements ActionListener
{
    private JButton btnAceptar, btnCancelar;
    private JTextField txtNombre, txtApellidos, txtTelefono;
    private JRadioButton amigo, conocido;
    ManejoPersona mp = new ManejoPersona();
    JFrameMostrar jfm;

    public PanelDatos()
    {
        setLayout(null);
        JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
        lblNombre.setBounds(10, 20, 80, 25);
        txtNombre = new JTextField(20);
        txtNombre.setBounds(100, 20, 165, 25);
        add(lblNombre);
        add(txtNombre);
        JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
        lblApellidos.setBounds(10, 50, 80, 25);
        txtApellidos = new JTextField(30);
        txtApellidos.setBounds(100, 50, 165, 25);
        add(lblApellidos);
        add(txtApellidos);
        JLabel lblTelefono = new JLabel("Celular: ", JLabel.RIGHT);
        lblTelefono.setBounds(10, 80, 80, 25);
        txtTelefono = new JTextField(15);
        txtTelefono.setBounds(100, 80, 165, 25);
        add(lblTelefono);
        add(txtTelefono);

        ButtonGroup gpoBotones = new ButtonGroup();
        amigo = new JRadioButton("Amigo", true);
        amigo.setBounds(140, 110, 100, 25);
        conocido = new JRadioButton("Conocido");
        conocido.setBounds(25, 110, 100, 25);
        gpoBotones.add(amigo);
        gpoBotones.add(conocido);

        add(amigo);
        add(conocido);

        btnAceptar = new JButton("Guardar");
        btnAceptar.setBounds(150, 150, 100, 25);
        btnAceptar.addActionListener(this);
        btnCancelar = new JButton("Mostrar");
        btnCancelar.setBounds(40, 150, 100, 25);
        btnCancelar.addActionListener(this);

        add(btnAceptar);
        add(btnCancelar);
    }

    public void actionPerformed(ActionEvent e) {
        String tipo = "Amigo";
        if(conocido.isSelected())
            tipo="Conocido";

        if (e.getSource()==btnAceptar) {
            if (txtNombre.getText()==null||txtNombre.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
            }
            else
            if(txtTelefono.getText()==null||txtTelefono.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Debes capturar su teléfono",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtTelefono.requestFocus();
            }
            else
            {
                mp.agregar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), tipo);
                JOptionPane.showMessageDialog(null, "Se guardarán los datos",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.setText(null);
                txtTelefono.setText("");
                txtApellidos.setText("");
                txtNombre.requestFocus();

            }
        }

        if (e.getSource()==btnCancelar) {
            jfm = new JFrameMostrar();
        }
    }

}
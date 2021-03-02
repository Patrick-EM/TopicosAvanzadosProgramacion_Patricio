import javax.swing.*;
        import java.awt.*;

public class JFrameDatos extends JFrame
{
    PanelDatos pdA = new PanelDatos();
    public JFrameDatos()
    {     initComponents();
    }

    private void initComponents()
    {
        setSize(300, 270);
        setTitle("Datos Personales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pdA);
        setVisible(true);
    }
}
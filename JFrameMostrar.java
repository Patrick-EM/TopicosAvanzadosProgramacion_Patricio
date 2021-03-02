import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
    MostrarDatos mostrar = new MostrarDatos();

    public JFrameMostrar()
    {
        initComponents();
    }

    private void initComponents()
    {
        setSize(300, 270);
        setTitle("Contactos Registrados");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);

    }
}

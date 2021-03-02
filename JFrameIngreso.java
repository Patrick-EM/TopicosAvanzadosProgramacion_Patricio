import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends  JFrame{
    IngresoA piA = new IngresoA();
    public JFrameIngreso(){
        initComponents();
    }

    private void initComponents()
    {
        setSize(300, 200);
        setTitle("Ususario y contraseña");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(piA);
        setVisible(true);
    }
}


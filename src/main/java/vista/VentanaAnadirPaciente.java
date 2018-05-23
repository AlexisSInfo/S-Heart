package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaAnadirPaciente extends JFrame{
    private PanelBtnAnadirPaciente botones;
    
    public VentanaAnadirPaciente() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 700);
        this.setTitle("S-Hearth");
        
        this.botones = new PanelBtnAnadirPaciente();
        this.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

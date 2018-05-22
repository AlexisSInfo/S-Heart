package vista;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VentanaCalendario extends JFrame {

    public VentanaCalendario(String doctor) {
        initComponent(doctor);
    }
    
    private void initComponent(String doctor){
        this.setSize(400, 250);
        this.setTitle("S-Hearth "+doctor );        
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
}

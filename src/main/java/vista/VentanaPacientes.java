package vista;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VentanaPacientes extends JFrame{
   private JComboBox<String> pacientes;
   private PanelBotonesVtnPacientes botones;

    public VentanaPacientes() {
        initComponent();
    }
   
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(400, 250);
        this.setTitle("S-Hearth");
        
        this.pacientes = new JComboBox<>();
        this.pacientes.addItem("mario hugo");
        this.pacientes.addItem("juan carlos bodoque");
        this.pacientes.addItem("tulio triviño");
        this.add(pacientes, BorderLayout.NORTH);
        this.botones = new PanelBotonesVtnPacientes();
        this.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

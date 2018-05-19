package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VentanaDoctores extends JFrame{
    private JLabel titulo;
    private JButton btnVolver;
    private PanelBotonesAlargo pacientes;
    
    public VentanaDoctores() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 700);
        this.setTitle("S-Hearth");
        
        this.titulo = new JLabel("   Doctores");
        this.titulo.setFont(new Font("comic sans", titulo.getHeight()+30, titulo.getWidth()+30));
        this.add(titulo, BorderLayout.NORTH);
        this.pacientes = new PanelBotonesAlargo();
        this.add(pacientes, BorderLayout.CENTER);
        this.btnVolver = new JButton("Volver");
        this.add(btnVolver, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

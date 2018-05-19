package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEspecialidades extends JFrame{
    private JLabel titulo;
    private PanelBotonesInferior botones;
    private PanelBotonesAlargo especialidades;

    public VentanaEspecialidades() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 700);
        this.setTitle("S-Hearth");
        
        this.titulo = new JLabel("  Especialidades");
        this.titulo.setFont(new Font("comic sans", titulo.getHeight()+30, titulo.getWidth()+30));
        this.add(titulo, BorderLayout.NORTH);
        this.especialidades = new PanelBotonesAlargo();
        this.add(especialidades, BorderLayout.CENTER);
        this.botones = new PanelBotonesInferior();
        this.add(botones, BorderLayout.SOUTH);
                
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

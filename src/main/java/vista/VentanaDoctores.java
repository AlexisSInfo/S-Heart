package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaDoctores extends JFrame implements ActionListener{
    private JLabel titulo;
    private PanelBotonesInferior botones;
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
        this.botones = new PanelBotonesInferior();
        this.botones.btnEditar.addActionListener(this);
        this.botones.btnVolver.addActionListener(this);
        this.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botones.btnEditar){
            //equisde
        }else if(e.getSource()== botones.btnVolver){
            VentanaEspecialidades especialidades = new VentanaEspecialidades();
            this.dispose();
        }
    }
}

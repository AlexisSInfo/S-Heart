package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEspecialidades extends JFrame implements ActionListener{
    private JLabel titulo;
    private PanelBotonesInferior botones;
    private PanelBotonesEspecialidades especialidades;

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
        this.especialidades = new PanelBotonesEspecialidades(this);
        this.add(especialidades, BorderLayout.CENTER);
        this.botones = new PanelBotonesInferior();
        this.botones.btnAgregar.addActionListener(this);
        this.botones.btnVolver.addActionListener(this);
        this.add(botones, BorderLayout.SOUTH);
                
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botones.btnAgregar){
            //equisde
        }else if(e.getSource()== botones.btnVolver){
            VentanaInicial inicio = new VentanaInicial();
            this.dispose();
        }
    }
}

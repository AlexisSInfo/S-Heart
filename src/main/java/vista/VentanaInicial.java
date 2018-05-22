package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class VentanaInicial extends JFrame implements ActionListener{
    private PanelImagenVentanaInicial panelmagen;
    private PanelBotonesVentanaInicial panelBotones;

    public VentanaInicial() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(600, 300);
        this.setTitle("S-Hearth");
        this.panelmagen = new PanelImagenVentanaInicial();
        this.add(panelmagen, BorderLayout.NORTH);
        this.panelBotones = new PanelBotonesVentanaInicial();
        this.panelBotones.botonPacientes.addActionListener(this);
        this.panelBotones.botonDoctores.addActionListener(this);
        this.add(panelBotones, BorderLayout.SOUTH);
                
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelBotones.botonPacientes){
            VentanaPacientes pacientes = new VentanaPacientes();
            this.dispose();
        }else if (e.getSource() == this.panelBotones.botonDoctores){
            VentanaEspecialidades especialidades = new VentanaEspecialidades();
            this.dispose();
        }
    }
}

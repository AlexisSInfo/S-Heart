package vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesVentanaInicial extends JPanel{
    public JButton botonPacientes, botonDoctores;

    public PanelBotonesVentanaInicial() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dis = new BorderLayout();
        this.setLayout(dis);
        this.botonDoctores = new JButton("Ver doctores");
        this.add(botonDoctores, BorderLayout.EAST);
        this.botonPacientes = new JButton("Ver Pacientes");
        this.add(botonPacientes, BorderLayout.WEST);
        
    }
}

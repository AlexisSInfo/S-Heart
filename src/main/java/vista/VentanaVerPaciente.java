package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaVerPaciente extends JFrame implements ActionListener{
    private PanelTxtAnadirPaciente texto;
    private JButton volver;

    public VentanaVerPaciente(String paciente) {
        initComponent(paciente);
    }
    
    private void initComponent(String paciente){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(500, 350);
        this.setTitle("S-Hearth");
        
        this.texto = new PanelTxtAnadirPaciente();
        this.texto.desactivar();
        this.texto.escribir(paciente,"" , "", "", "");
        this.add(texto, BorderLayout.NORTH);
        this.volver = new JButton("Volver");
        this.volver.addActionListener(this);
        this.add(volver);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == volver){
            VentanaPacientes pacientes = new VentanaPacientes();
            this.dispose();
        }
    }
}

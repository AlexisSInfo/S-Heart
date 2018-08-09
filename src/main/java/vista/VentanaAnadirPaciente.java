package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Paciente;
import util.LectorJson;

public class VentanaAnadirPaciente extends JFrame implements ActionListener{
    private PanelBtnAnadirPaciente botones;
    private PanelTxtAnadirPaciente texto;
    private JButton anadir, cancelar;
    private LectorJson lector;
    
    public VentanaAnadirPaciente() {
        initComponent();
        lector = new LectorJson();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(500, 350);
        this.setTitle("S-Hearth");
        
        this.texto = new PanelTxtAnadirPaciente();
        this.add(texto, BorderLayout.NORTH);
        this.botones = new PanelBtnAnadirPaciente();
        this.anadir = this.botones.getBtnAnadir(); this.anadir.addActionListener(this);
        this.cancelar = this.botones.getBtnCancelar(); this.cancelar.addActionListener(this);
        this.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == anadir){
            Paciente paciente = texto.obtenerPaciente();
            boolean comp = lector.agregarPaciente(paciente);
            if (!comp) {
                int input = JOptionPane.showConfirmDialog(null, 
                "No se pudo añadir al paciente", "Error al añadir", JOptionPane.DEFAULT_OPTION);
            }
        }else if(ae.getSource()==cancelar){
            VentanaPacientes pacientes = new VentanaPacientes();
            this.dispose();
        }
    }
}

package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaAnadirPaciente extends JFrame implements ActionListener{
    private PanelBtnAnadirPaciente botones;
    private PanelTxtAnadirPaciente texto;
    private JButton anadir, cancelar;
    
    public VentanaAnadirPaciente() {
        initComponent();
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
            System.out.println("añadido");
        }else if(ae.getSource()==cancelar){
            VentanaPacientes pacientes = new VentanaPacientes();
            this.dispose();
        }
    }
}

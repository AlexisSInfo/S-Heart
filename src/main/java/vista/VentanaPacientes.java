package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VentanaPacientes extends JFrame implements ActionListener{
   private JComboBox<String> pacientes;
   private PanelBotonesVtnPacientes botones;
   private JButton btnVer, btnBorrar, btnVolver, btnAnadir;

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
        btnVer = botones.getBtnVer(); btnVer.addActionListener(this);
        btnBorrar = botones.getBtnEliminar(); btnBorrar.addActionListener(this);
        btnVolver = botones.getBtnVolver(); btnVolver.addActionListener(this);
        btnAnadir = botones.getBtnAnadir(); btnAnadir.addActionListener(this);
        this.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btnVer) {
            VentanaVerPaciente paciente = new VentanaVerPaciente(this.pacientes.getSelectedItem()+"");
            this.dispose();
        }else if(e.getSource()== btnBorrar){
            int selectedOption = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar al pasiente "+pacientes.getSelectedItem()+"?", 
                    "Eliminar pasiente", JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) {
                
            }
        }else if(e.getSource() == btnVolver){
            VentanaInicial inicio = new VentanaInicial();
            this.dispose();
        }else if(e.getSource()== btnAnadir){
            VentanaAnadirPaciente anadir = new VentanaAnadirPaciente();
            this.dispose();
        }
    }
}

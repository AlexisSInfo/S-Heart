package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VentanaAnadirCita extends JFrame implements ActionListener{
    private JComboBox<String> pacientes;
    private JButton aceptar, cancelar;
    private JPanel panelBotones, panelTextos,panelrazon;
    private JLabel lblRazon;
    private JTextField tfRazon;

    public VentanaAnadirCita() {
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
        
        this.panelrazon = new JPanel();
        this.panelrazon.setLayout(new FlowLayout());
        this.lblRazon = new JLabel("Razon de la visita");
        this.panelrazon.add(lblRazon);
        this.tfRazon = new JTextField(15);
        this.panelrazon.add(tfRazon);
        
        this.panelTextos = new JPanel();
        this.panelTextos.setLayout(new BoxLayout(this.panelTextos, BoxLayout.PAGE_AXIS));
        this.panelTextos.add(pacientes);
        this.panelTextos.add(panelrazon);
        this.add(panelTextos, BorderLayout.NORTH);
        this.panelBotones = new JPanel();
        this.panelBotones.setLayout(new BorderLayout());
        this.aceptar = new JButton("Aceptar");
        this.aceptar.addActionListener(this);
        this.panelBotones.add(aceptar, BorderLayout.WEST);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.addActionListener(this);
        this.panelBotones.add(cancelar,BorderLayout.EAST);
        this.add(panelBotones, BorderLayout.SOUTH);
                
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==aceptar){
            System.out.println("añadido");
            this.dispose();
        }else if(ae.getSource()==cancelar){
            this.dispose();
        }
    }
    
}

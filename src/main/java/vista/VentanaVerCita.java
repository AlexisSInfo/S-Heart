package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaVerCita extends JFrame implements ActionListener{
    private PanelInfoCita info;
    private JButton aceptar;
    private JPanel panelbtn;

    public VentanaVerCita() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(400, 250);
        this.setTitle("S-Hearth");
        
        this.info = new PanelInfoCita();
        this.add(info, BorderLayout.CENTER);
        this.panelbtn = new JPanel();
        this.aceptar = new JButton("Aceptar");
        this.aceptar.addActionListener(this);
        this.panelbtn.add(aceptar);
        this.add(panelbtn, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== aceptar){
            VentanaHorario horario  = new VentanaHorario();
            this.dispose();
        }
    }
}

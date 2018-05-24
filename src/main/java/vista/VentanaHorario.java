package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaHorario extends JFrame implements ActionListener{
    private PanelHoras horas;
    private JButton volver, editar;
    private JPanel panel;

    public VentanaHorario() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 550);
        this.setTitle("S-Hearth");
        
        this.volver=new JButton("Volver");
        this.volver.addActionListener(this);
        this.editar=new JButton("Editar");
        this.editar.addActionListener(this);
        this.panel = new JPanel();
        this.panel.setLayout(new FlowLayout());
        this.panel.add(editar);
        this.panel.add(volver);
        this.add(panel, BorderLayout.SOUTH);
        this.horas = new PanelHoras(this);
        this.add(horas, BorderLayout.CENTER);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==volver){
            VentanaCalendario calendario = new VentanaCalendario("");
            this.dispose();
        }else if(ae.getSource()== editar){
            VentanaEditarHoras horas = new VentanaEditarHoras();
            this.dispose();
        }
    }
}

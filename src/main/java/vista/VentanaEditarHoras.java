package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaEditarHoras extends JFrame implements ActionListener{
    private PanelEditarHoras horas;
    private JPanel panel;
    private JButton aceptar;

    public VentanaEditarHoras() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 550);
        this.setTitle("S-Hearth");
        
        this.horas = new PanelEditarHoras();
        this.add(horas, BorderLayout.CENTER);
        this.panel= new JPanel();
        this.panel.setLayout(new FlowLayout());
        this.aceptar = new JButton("aceptar");
        this.aceptar.addActionListener(this);
        this.panel.add(aceptar);
        this.add(panel, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == aceptar) {
            VentanaHorario horario = new VentanaHorario();
            this.dispose();
        }
    }
}

package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaCalendario extends JFrame implements ActionListener{
    private JButton editarDias, horario;

    public VentanaCalendario(String doctor) {
        initComponent(doctor);
    }
    
    private void initComponent(String doctor){
        FlowLayout dist = new FlowLayout();
        this.setLayout(dist);
        this.setSize(400, 250);
        this.setTitle("S-Hearth "+doctor );        
        
        this.editarDias = new JButton("dias");
        this.editarDias.addActionListener(this);
        this.add(editarDias);
        this.horario = new JButton("horario");
        this.horario.addActionListener(this);
        this.add(horario);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==editarDias) {
            EditarDiasHabiles editar = new EditarDiasHabiles();
            this.dispose();
        }else if(ae.getSource()==horario){
            VentanaHorario horario = new VentanaHorario();
            this.dispose();
        }
    }
    
}

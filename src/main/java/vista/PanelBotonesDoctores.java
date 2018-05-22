package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelBotonesDoctores extends JPanel implements ActionListener{
    private ArrayList<JButton> doctores;
    private JFrame padre;

    public PanelBotonesDoctores(JFrame padre) {
        initComponent(padre);
    }
    
    private void initComponent(JFrame padre){
        /*aqui ira el metodo (aun no desarrollado) que obtiene las especialidades
        desde la base de datos*/
        this.padre = padre;
        this.doctores = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            JButton boton = new JButton("Referencia "+(i+1));
            boton.setName(String.valueOf(i));
            boton.addActionListener(this);
            this.doctores.add(boton);
        }
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        for (int i = 0; i < doctores.size(); i++) {
            constraints.gridx = 1;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weighty = 0.2;
            this.add (doctores.get(i), constraints);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof JButton){
            for (int i = 0; i < this.doctores.size(); i++) {
                if (((JButton)ae.getSource()).getName().equals(String.valueOf(i))) {
                    VentanaCalendario calendario = new VentanaCalendario(((JButton)ae.getSource()).getText());
                    this.padre.dispose();
                }
            }
            
        }
    }
}

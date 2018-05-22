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

public class PanelBotonesEspecialidades extends JPanel implements ActionListener{
    private ArrayList<JButton> especialidades;
    private JFrame padre;

    public PanelBotonesEspecialidades(JFrame padre) {
        initComponent(padre);
    }
    
    private void initComponent(JFrame padre){
        /*aqui ira el metodo (aun no desarrollado) que obtiene las especialidades
        desde la base de datos*/
        this.padre = padre;
        this.especialidades = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            JButton boton = new JButton("Referencia "+(i+1));
            boton.setName(String.valueOf(i));
            boton.addActionListener(this);
            this.especialidades.add(boton);
        }
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        for (int i = 0; i < especialidades.size(); i++) {
            constraints.gridx = 1;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weighty = 0.2;
            this.add (especialidades.get(i), constraints);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof JButton){
            for (int i = 0; i < this.especialidades.size(); i++) {
                if (((JButton)ae.getSource()).getName().equals(String.valueOf(i))) {
                    VentanaDoctores doctores = new VentanaDoctores(((JButton)ae.getSource()).getText());
                    this.padre.dispose();
                }
            }
            
        }
    }
}

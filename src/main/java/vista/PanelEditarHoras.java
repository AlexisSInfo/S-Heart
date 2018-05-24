package vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelEditarHoras extends JPanel implements ActionListener {

    private ArrayList<JButton> horas;

    public PanelEditarHoras() {
        initComponent();
    }

    private void initComponent() {
        this.horas = new ArrayList<>();
        for (int i = 9; i < 20; i++) {
            JButton boton = new JButton(i + ":00");
            boton.setName(String.valueOf(i));
            boton.addActionListener(this);
            boton.setBackground(Color.cyan);
            this.horas.add(boton);
        }
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        for (int i = 0; i < horas.size(); i++) {
            constraints.gridx = 1;
            constraints.gridy = i;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.weighty = 0.1;
            this.add(horas.get(i), constraints);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof JButton) {
            int value = Integer.valueOf(((JButton) ae.getSource()).getName());
            
            if (value>=9 || value<=19) {
                cambiarEstadoHora(value-9);
            }
        }
    }

    public void cambiarEstadoHora(int hora) {
        if (this.horas.get(hora).getBackground() == Color.cyan) {
            JButton boton = this.horas.get(hora);
            boton.setBackground(Color.red);
            this.horas.set(hora, boton);
        } else if (this.horas.get(hora).getBackground() == Color.red) {
            JButton boton = this.horas.get(hora);
            boton.setBackground(Color.cyan);
            this.horas.set(hora, boton);
        }
    }
}

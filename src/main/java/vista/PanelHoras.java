package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelHoras extends JPanel implements ActionListener {

    private ArrayList<JButton> horas;
    private JFrame padre;
    private JButton volver;

    public PanelHoras(JFrame padre) {
        this.padre = padre;
        initComponent();

    }

    private void initComponent() {
        this.horas = new ArrayList<>();
        for (int i = 9; i < 20; i++) {
            JButton boton = new JButton(i + ":00");
            boton.setName(String.valueOf(i));
            boton.addActionListener(this);
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

            if (((JButton) ae.getSource()).getName().equals(String.valueOf(9))) {
                opciones(9);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(10))) {
                opciones(10);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(11))) {
                opciones(11);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(12))) {
                opciones(12);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(13))) {
                opciones(13);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(14))) {
                opciones(14);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(15))) {
                opciones(15);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(16))) {
                opciones(16);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(17))) {
                opciones(17);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(18))) {
                opciones(18);
            } else if (((JButton) ae.getSource()).getName().equals(String.valueOf(19))) {
                opciones(19);
            }
        }
    }

    private void opciones(int hora) {
        String[] buttons = {"Añadir cita", "Editar cita", "Eliminar cita", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Que Decea Hacer?",
                "Seleccionar accion || "+hora+":00", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);
        if (opcion == 0) {
            System.out.println(hora);
//            this.padre.dispose();
        } else if (opcion == 1) {
            System.out.println("a "+hora);
//            this.padre.dispose();
        } else if (opcion == 2) {
            int opcion1 = JOptionPane.showConfirmDialog(null, "¿Estas Seguro que quieres eliminar la cita de las "+hora+":00?",
                    "Eliminar cita", JOptionPane.YES_NO_OPTION);
            if (opcion1 == JOptionPane.YES_OPTION) {
                System.out.println("eliminado");
            }
        }
    }
}

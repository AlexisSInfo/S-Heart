package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotonesVtnPacientes extends JPanel{
    private JButton btnVer, btnEliminar, btnVolver, btnAnadir;
    private JLabel espacio;

    public PanelBotonesVtnPacientes() {
        initComponent();
    }
    
    private void initComponent(){
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        GridBagConstraints constraints = new GridBagConstraints();
        
        this.btnVer = new JButton("Ver");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0;
        this.add (btnVer, constraints); 
        constraints.weighty = 0.0;
        
        this.btnAnadir = new JButton("Añadir");
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnAnadir, constraints); 
        constraints.weighty = 0.0;
        
        this.btnEliminar = new JButton("Eliminar");
        constraints.gridx = 5;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnEliminar, constraints); 
        constraints.weighty = 0.0;
        
        this.btnVolver = new JButton("Volver");
        constraints.gridx = 7;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnVolver, constraints); 
        constraints.weighty = 0.0;
        
        this.espacio = new JLabel(" ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (espacio, constraints); 
        constraints.weighty = 0.0;
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
    
    public JButton getBtnAnadir(){
        return btnAnadir;
    }
}

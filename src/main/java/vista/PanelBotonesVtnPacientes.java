package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesVtnPacientes extends JPanel{
    private JButton btnVer, btnEliminar, btnVolver;

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
        constraints.weightx = 0.2;
        this.add (btnVer, constraints); 
        constraints.weighty = 0.0;
        
        this.btnEliminar = new JButton("Eliminar");
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnEliminar, constraints); 
        constraints.weighty = 0.0;
        
        this.btnVolver = new JButton("Volver");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnVolver, constraints); 
        constraints.weighty = 0.0;
    }
}

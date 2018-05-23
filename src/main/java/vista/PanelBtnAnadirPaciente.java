package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBtnAnadirPaciente extends JPanel{
    private JButton btnAnadir, btnCancelar;

    public PanelBtnAnadirPaciente() {
        initComponent();
    }
    
    private void initComponent(){
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        GridBagConstraints constraints = new GridBagConstraints();
        
        this.btnAnadir = new JButton("Ver");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnAnadir, constraints); 
        constraints.weighty = 0.0;
        
        this.btnCancelar = new JButton("Eliminar");
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1; 
        constraints.weighty = 1.0;
        constraints.weightx = 0.2;
        this.add (btnCancelar, constraints); 
        constraints.weighty = 0.0;
    }
}

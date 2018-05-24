package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInfoCita extends JPanel{
    private JLabel nombre, rut, razon;
    private JTextField tfnombre,tfrut,tfrazon;

    public PanelInfoCita() {
        initComponent();
    }
    
    private void initComponent(){
        this.nombre = new JLabel("Nombre");
        this.rut = new JLabel("RUT");
        this.razon = new JLabel("Razon");
        this.tfnombre = new JTextField(15);
        this.tfnombre.setEnabled(false);
        this.tfrut = new JTextField(15);
        this.tfrut.setEnabled(false);
        this.tfrazon = new JTextField(15);
        this.tfrazon.setEnabled(false);
        
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        GridBagConstraints cons = new GridBagConstraints();
        
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 0;
        this.add (nombre, cons);
        
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 0;
        this.add (rut, cons);
        
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 0;
        this.add (razon, cons);
        
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 1;
        this.add (tfnombre, cons);
        
        cons.gridx = 2;
        cons.gridy = 1;
        cons.gridwidth = 2;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 1;
        this.add (tfrut, cons);
        
        cons.gridx = 2;
        cons.gridy = 2;
        cons.gridwidth = 2;
        cons.gridheight = 1; 
        cons.weighty = 0.5;
        cons.weightx = 1;
        this.add (tfrazon, cons);
    }
}

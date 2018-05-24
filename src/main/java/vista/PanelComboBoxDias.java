package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelComboBoxDias extends JPanel{
    private JComboBox<String> dias;
    private JCheckBox confirmacion;
    public JButton confirmar;

    public PanelComboBoxDias() {
        initComponent();
    }
    private void initComponent(){
        GridBagLayout dist = new GridBagLayout();
        this.setLayout(dist);
        GridBagConstraints cons = new GridBagConstraints();
        
        this.dias = new JComboBox<>();
        this.dias.addItem(" ");this.dias.addItem("Lunes");this.dias.addItem("Martes");
        this.dias.addItem("Miercoles");this.dias.addItem("Jueves");this.dias.addItem("Viernes");
        this.dias.addItem("Sabado");this.dias.addItem("Domingo");
        cons.gridx=0;
        cons.gridy=0;
        cons.gridwidth = 3;
        cons.gridheight= 1;
        cons.weightx = 1.0;
        this.add(dias, cons);
        
        this.confirmacion = new JCheckBox("¿habilitado?");
        cons.gridx=0;
        cons.gridy=1;
        cons.gridwidth = 3;
        cons.gridheight= 1;
        cons.weightx = 1.0;
        this.add(confirmacion, cons);
        
        this.confirmar = new JButton("Confirmar");
        cons.gridx=0;
        cons.gridy=2;
        cons.gridwidth = 3;
        cons.gridheight= 1;
        cons.weightx = 1.0;
        this.add(confirmar, cons);
        
    }
    
    public String obtenerDia(){
        return dias.getSelectedItem()+"";
    }
}

package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesAlargo extends JPanel implements ActionListener{
    private ArrayList<JButton> especialidades;

    public PanelBotonesAlargo() {
        initComponent();
    }
    
    private void initComponent(){
        /*aqui ira el metodo (aun no desarrollado) que obtiene las especialidades
        desde la base de datos*/
        this.especialidades = new ArrayList<>();
        JButton esp1, esp2, esp3, esp4,esp5,esp6,esp7,esp8,esp9;
        esp1 = new JButton("Referencia 1");
        esp2 = new JButton("Referencia 2");
        esp3 = new JButton("Referencia 3");
        esp4 = new JButton("Referencia 4");esp5 = new JButton("Referencia 5");esp6 = new JButton("Referencia 6");
        esp7 = new JButton("Referencia 7");esp8 = new JButton("Referencia 8");esp9 = new JButton("Referencia 9");
        this.especialidades.add(esp1);
        this.especialidades.add(esp2);
        this.especialidades.add(esp3);
        this.especialidades.add(esp4);
        this.especialidades.add(esp4);this.especialidades.add(esp5);this.especialidades.add(esp6);
        this.especialidades.add(esp7);this.especialidades.add(esp8);this.especialidades.add(esp9);
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
        
    }
}

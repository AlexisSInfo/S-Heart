package vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotonesInferior extends JPanel{
    public JButton btnAgregar, btnVolver;

    public PanelBotonesInferior() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.btnAgregar = new JButton("agregar");
        this.add(btnAgregar, BorderLayout.WEST);
        this.btnVolver = new JButton("Volver");
        this.add(btnVolver, BorderLayout.EAST);
    }
}

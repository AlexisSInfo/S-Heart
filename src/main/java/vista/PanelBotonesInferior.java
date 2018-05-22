package vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotonesInferior extends JPanel{
    public JButton btnEditar, btnVolver;

    public PanelBotonesInferior() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.btnEditar = new JButton("Editar");
        this.add(btnEditar, BorderLayout.WEST);
        this.btnVolver = new JButton("Volver");
        this.add(btnVolver, BorderLayout.EAST);
    }
}

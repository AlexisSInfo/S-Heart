package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaInicial extends JFrame{
    private PanelImagenVentanaInicial panelmagen;
    private PanelBotonesVentanaInicial panelBotones;

    public VentanaInicial() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(600, 300);
        this.setTitle("S-Hearth");
        this.panelmagen = new PanelImagenVentanaInicial();
        this.add(panelmagen, BorderLayout.NORTH);
        this.panelBotones = new PanelBotonesVentanaInicial();
        this.add(panelBotones, BorderLayout.SOUTH);
                
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

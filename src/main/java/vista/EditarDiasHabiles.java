package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class EditarDiasHabiles extends JFrame implements ActionListener{
    private PanelComboBoxDias dias;

    public EditarDiasHabiles() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 150);
        this.setTitle("S-Hearth");
        
        this.dias = new PanelComboBoxDias();
        this.dias.confirmar.addActionListener(this);
        this.add(dias,BorderLayout.NORTH);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==dias.confirmar){
            System.out.println("confirmado "+dias.obtenerDia() );
            VentanaCalendario calendario = new VentanaCalendario("");
            this.dispose();
        }
    }
}

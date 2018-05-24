package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaHorario extends JFrame implements ActionListener{
    private PanelHoras horas;
    private JButton volver;

    public VentanaHorario() {
        initComponent();
    }
    
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.setSize(300, 550);
        this.setTitle("S-Hearth");
        
        this.volver=new JButton("Volver");
        this.volver.addActionListener(this);
        this.add(volver, BorderLayout.SOUTH);
        this.horas = new PanelHoras(this);
        this.add(horas, BorderLayout.CENTER);
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public JButton getVolver(){
        return volver;
    }
    protected void metodoVolver(){
        System.out.println("A");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==volver){
            VentanaCalendario calendario = new VentanaCalendario("");
            this.dispose();
        }
    }
}
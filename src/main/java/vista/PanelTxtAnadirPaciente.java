package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelTxtAnadirPaciente extends JPanel {

    private JTextField tfNombre, tfRut, tfContacto;
    private JTextArea taHistorial;
    private JLabel nombre, rut, contacto, historial,espacio;

    public PanelTxtAnadirPaciente() {
        initComponent();
    }

    private void initComponent() {
        GridLayout dist = new GridLayout(4,2);
        this.setLayout(dist);
        //x -> horizontal

        this.nombre = new JLabel("Nombre");
        this.add(nombre);
        this.tfNombre = new JTextField(10);
        this.add(tfNombre);
        this.rut = new JLabel("RUT");
        this.add(rut);
        this.tfRut = new JTextField(10);
        this.add(tfRut);
        this.contacto = new JLabel("Contacto");
        this.add(contacto);
        this.tfContacto = new JTextField(10);
        this.add(tfContacto);
        this.historial = new JLabel("Historial");
        this.add(historial);
        this.taHistorial = new JTextArea(4,10);
        this.add(taHistorial);
    }
    
    public void desactivar(){
        this.tfNombre.setEditable(false);
        this.tfRut.setEditable(false);
        this.tfContacto.setEditable(false);
        this.taHistorial.setEditable(false);
    }
    public void escribir(String nombre,String rut,String contacto,String historial){
        this.tfNombre.setText(nombre);
        this.tfRut.setText(rut);
        this.tfContacto.setText(contacto);
        this.taHistorial.setText(historial);
    }
}

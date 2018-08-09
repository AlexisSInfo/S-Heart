package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Paciente;

public class PanelTxtAnadirPaciente extends JPanel {

    private JTextField tfNombre, tfRut, tfContacto, tfApellido;
//    private JTextArea taHistorial;
    private JLabel nombre, rut, contacto, apellido,espacio;

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
        this.apellido = new JLabel("Apellido");
        this.add(nombre);
        this.tfApellido = new JTextField(10);
        this.add(tfApellido);
        this.rut = new JLabel("RUT");
        this.add(rut);
        this.tfRut = new JTextField(10);
        this.add(tfRut);
        this.contacto = new JLabel("Contacto");
        this.add(contacto);
        this.tfContacto = new JTextField(10);
        this.add(tfContacto);
//        this.historial = new JLabel("Historial");
//        this.add(historial);
//        this.taHistorial = new JTextArea(4,10);
//        this.add(taHistorial);
    }
    
    public void desactivar(){
        this.tfNombre.setEditable(false);
        this.tfApellido.setEditable(false);
        this.tfRut.setEditable(false);
        this.tfContacto.setEditable(false);
//        this.taHistorial.setEditable(false);
    }
    public void escribir(String nombre,String rut,String contacto,String historial,String apellido){
        this.tfNombre.setText(nombre);
        this.tfApellido.setText(apellido);
        this.tfRut.setText(rut);
        this.tfContacto.setText(contacto);
//        this.taHistorial.setText(historial);
    }
    
    public Paciente obtenerPaciente(){
        Paciente paciente = new Paciente(tfNombre.getText(), tfApellido.getText(), tfRut.getText(), tfContacto.getText());
        return paciente;
    }
}

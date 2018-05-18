package vista;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImagenVentanaInicial extends JPanel{
    private ImageIcon img;
    private JButton boton;
    private JLabel label;

    public PanelImagenVentanaInicial() {
        initComponent();
    }
    private void initComponent(){
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        this.label = new JLabel("   S-Heart");
        label.setFont(new Font("comic sans", 250, 120));
        this.add(label, BorderLayout.CENTER);
//        img = new ImageIcon("resourses\\imagen.png");
//        Image img2 = img.getImage();
//        BufferedImage bi = new BufferedImage(img2.getWidth(null), img2.getHeight(null), BufferedImage.TYPE_INT_ARGB);
//        Graphics g = bi.createGraphics();
//        g.drawImage(img2, 0, 0, 250, 150, null);
//        img = new ImageIcon(bi);
//        this.boton = new JButton(); this.boton.setIcon(img);
//        this.add(boton, BorderLayout.CENTER);

    }
}

package tallerswing;

import javax.swing.*;
import java.awt.*;

class BienvenidoSwing extends JFrame {

    /**
     *
     * @author sigmotoa
     */
    
    JLabel etiqueta1, etiqueta2;
    JTextField texto1;
    public BienvenidoSwing()
    {   super("Programando con @sigmotoa");
        Container contenedor=getContentPane();
        contenedor.setLayout(null);
        texto1=new JTextField("Aqui otro texto");
        etiqueta1=new JLabel();
        etiqueta1.setText("Etiqueta lista, inicializada por @sigmotoa usando el metodo setText()");
        etiqueta2=new JLabel("Este es otro texto nuevo");
        etiqueta1.setBounds(10, 10, 500, 20);
        etiqueta2.setBounds(10, 50, 320, 20);
        texto1.setBounds(40, 30, 200, 20);
        contenedor.add(etiqueta1);
        contenedor.add(texto1);
        contenedor.add(etiqueta2);
        setSize(500,350);
        setVisible(true);
    }
    public static void main(String[] args) {
        BienvenidoSwing ventana=new BienvenidoSwing();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }

   

}

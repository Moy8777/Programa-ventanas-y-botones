package pedro.com.app.mvc.view;

import pedro.com.app.mvc.view.VentanaSecundarias;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Ventana Principal"); // Establecemos el título de la ventana
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configuramos la acción de cierre
        setLayout(new GridLayout(4, 1)); // Usamos un diseño de cuadrícula con 4 filas y 1 columna
        setLocationRelativeTo(null); // Centramos la ventana en la pantalla

        // Arreglo con los títulos de las ventanas secundarias
        String[] titles = {"Ventana 1", "Ventana 2", "Ventana 3", "Ventana 4"};

        // Creamos los botones y les asignamos una acción (abrir ventana 1,2,3 o 4)
        for (String title : titles) {
            JButton button = new JButton(title); // Creamos un botón con el título correspondiente
            button.addActionListener(e -> VentanaSecundarias.openWindow(title)); // Asignamos el evento de apertura de ventana
            add(button); // Agregamos el botón a la ventana principal
        }

        setVisible(true); 
    }
}
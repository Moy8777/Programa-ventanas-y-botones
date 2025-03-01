package pedro.com.app.mvc.view;

import javax.swing.*;

public class VentanaSecundarias {
    public static void openWindow(String title) {
        JFrame newFrame = new JFrame(title); // Creamos una nueva ventana con el título recibido
        newFrame.setSize(200, 150); 
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Configura la ventana para que se cierre sin afectar la principal
        newFrame.add(new JLabel("Esta es " + title, SwingConstants.CENTER)); // Agregamos un texto centrado en la ventana
        newFrame.setLocationRelativeTo(null); // Centramos la ventana en la pantalla
        newFrame.setVisible(true); // Hacemos visible la ventana para que el usuario la pueda ver
    }
}

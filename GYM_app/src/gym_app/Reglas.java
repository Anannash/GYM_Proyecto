/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_app;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDY
 */
public class Reglas {

    public Reglas() {
    }
    
    
    
    public void CargarImagen(JLabel label, File archivoSeleccionado){
         JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
             archivoSeleccionado = fileChooser.getSelectedFile();
             String ruta = archivoSeleccionado.getName();
             
             
             
             try {
                  Image imagenSeleccionada = ImageIO.read(archivoSeleccionado);
                  ImageIcon Imagen = new ImageIcon(imagenSeleccionada);
                  
                  int labelancho = label.getWidth();
                  int labellargo=label.getHeight();
                  
                  
                  Image scaledImage = Imagen.getImage().getScaledInstance(labelancho, labellargo, Image.SCALE_SMOOTH);
                  
                  label.setIcon(new ImageIcon (scaledImage));
            } catch (Exception e) {
                
                    JOptionPane.showMessageDialog(null, "Error: "+e.toString());
            }
        }
    }
    
    
    public int CrearID(String valorUsuario){
        return 0;
    }
    
}

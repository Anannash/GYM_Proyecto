/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_app;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ANDY
 */
public class BD_Movimientos {
    
   

    public BD_Movimientos() {
        
    }
    
    public void AgregarCliente(JTextField nombre,JTextField apellidoP,JTextField apellidoM,JTextField idCliente,
            JComboBox Membresia,JTextField correo, JTextField celular,double peso, double estatura, double imc,
            String motivo, File foto, JComboBox sexo, String estudiante,JTextField edad){
        
       
        
        conectar ObjetoConexion = new conectar();
        
        String Alta="insert into cliente (id_cliente, membresia, nombreC, apellidoPC, "
                + "apellidoMC, correoC, celularC, peso_inicial, estatura, imc, motivo_entre, foto, sexo, "
                + "estudiante, edad)" +"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); " ;
        
        
        
        
        try {
            FileInputStream fis= new FileInputStream(foto);
            
            CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);
            
            cs.setInt(1, Integer.parseInt(idCliente.getText()));
            cs.setString(2, Membresia.getSelectedItem().toString());
            cs.setString(3, nombre.getText());
            cs.setString(4, apellidoP.getText());
            cs.setString(5, apellidoM.getText());
            cs.setString(6, correo.getText());
            cs.setInt(7, Integer.parseInt(celular.getText()));
            cs.setDouble(8, peso);
            cs.setDouble(9, estatura);
            cs.setDouble(10, imc);
            cs.setString(11, motivo);
            cs.setBinaryStream
        (2,fis, (int)foto.length());
            cs.setString(13, sexo.getSelectedItem().toString());
             cs.setString(14, estudiante);
             cs.setInt(15, Integer.parseInt(edad.getText()));
              
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Registro COMPLETADO !!!");
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void prueba (JTextField nombre){
         conectar ObjetoConexion = new conectar();
        
        String Alta="insert into prueba (id_cliente)" +"values (?); " ;
        
        
        
        
        try {
            //FileInputStream fis= new FileInputStream(foto);
            
            CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);
            
                int id = Integer.parseInt(nombre.getText());
            
          
            cs.setInt(1, id);
         
            //cs.setBinaryStream(2,fis, (int)foto.length());
         
              
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Registro COMPLETADO !!!");
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
            System.out.println(e.getMessage());
        }
    }
    
}

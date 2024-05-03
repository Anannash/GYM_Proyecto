/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_app;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.ResultSet;

/**
 *
 * @author ANDY
 */
public class BD_Movimientos {

    public BD_Movimientos() {

    }

    public void AgregarCliente(JTextField nombre, JTextField apellidoP, JTextField apellidoM, JTextField idCliente,
            JComboBox Membresia, JTextField correo, JTextField celular, double peso, double estatura, double imc,
            String motivo, File foto, Date fecha, JComboBox sexo, String estudiante, JTextField edad) {

        conectar ObjetoConexion = new conectar();

        String Alta = "insert into cliente (id_cliente, membresia, nombreC, apellidoPC, "
                + "apellidoMC, correoC, celularC, peso_inicial, estatura, imc, motivo_entre, foto,fecha, sexo, "
                + "estudiante, edad)" + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?); ";

        try {
            FileInputStream fis = new FileInputStream(foto);

            CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);

           

            cs.setString(1, idCliente.getText());
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
            cs.setBinaryStream(12, fis, (int) foto.length());
            cs.setDate(13, (java.sql.Date) fecha);
            cs.setString(14, sexo.getSelectedItem().toString());
            cs.setString(15, estudiante);
            cs.setInt(16, Integer.parseInt(edad.getText()));

            cs.execute();

            JOptionPane.showMessageDialog(null, "Registro COMPLETADO !!!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public int obtenerUltimoNumeroCliente() {
    int ultimoNumero = 0;
    
    // Aquí deberías tener tu lógica para obtener la conexión a tu base de datos
    conectar ObjetoConexion = new conectar();
    
    // Consulta SQL para obtener el máximo número de cliente
    String consulta = "SELECT MAX(id_cliente) AS ultimo_numero FROM cliente";
    
    try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            ultimoNumero = rs.getInt("ultimo_numero");
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
    
    return ultimoNumero;
}
    

}

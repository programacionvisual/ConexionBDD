/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Conexion {

    static Connection conex;
    static String url = "jdbc:mysql://localhost:3306/encuesta";
    static String user = "root";
    static String password = "rootSistem@s";

    public static Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }

    public void consultarUsuarios(){
        try{
        conexion();
        PreparedStatement ps;
        ResultSet res;
        
        ps=conex.prepareStatement("SELECT * FROM usuario");
        res=ps.executeQuery();
        while(res.next()){
            JOptionPane.showMessageDialog(null,res.getInt("idUser")+
                    res.getString("user")+res.getString("passw"));
        }
//        else{
//            JOptionPane.showMessageDialog(null, "no existe datos");
//        }
        conex.close();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

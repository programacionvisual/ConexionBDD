/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.FrmDocente;
import ec.edu.intsuperior.vista.Login;
import ec.edu.intsuperior.vista.LoginDocente;
import ec.edu.intsuperior.vista.LoginEstudiante;

/**
 *
 * @author Santiago
 */
public class Controlador {
    Login login = new Login(this);
    Administrador administrador=new Administrador(this);
   public LoginDocente ld = new LoginDocente(this);
    FrmDocente frmDocente= new FrmDocente(this);
    LoginEstudiante le= new LoginEstudiante(this);
   // Conexion conexion = new Conexion();
    
    public void conectar(){
        Conexion.conexion();
    }
    
    public void mostrarFrmDocente(){
        frmDocente.setVisible(true);
    }
     public void ocultarLogin(){
        login.setVisible(false);
        //login.setVisible(false);
    }
    public void mostrarLogin(){
        login.setVisible(true);
        //login.setVisible(false);
    }
   
    public void mostrarAdministrador(){
        administrador.setVisible(true);
    }
    public void mostarPanelDocente(){
          //  ld.setSize(500, 500);
         
          
       
        login.escritorio.removeAll();
        login.escritorio.add(ld);
        login.escritorio.revalidate();
//        escritorio.repaint();
    }
    
    public void mostrarPanelEstudiante(){
        login.escritorio.removeAll();
        login.escritorio.add(le);
        
        login.escritorio.revalidate();
        login.escritorio.repaint();
    }
}







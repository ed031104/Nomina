package com.usuario;
import java.util.ArrayList;

public class Usuario {
   
    private String contraseña;
    private String Nombre_usuario;
   

    public Usuario(){
    }
    public Usuario(String contraseña, String Nombre_usuario) {
        this.contraseña = contraseña;
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }


  
   

}

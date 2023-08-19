package com.usuario;
import java.util.ArrayList;

public class ControladorUsuario {

private ArrayList<Usuario> ListaUsuario;

public ControladorUsuario(){
    ListaUsuario = new ArrayList<>();
}


public Usuario BuscarUsuario(String Nombre_usuario){
    
    for (int i = 0; i < ListaUsuario.size(); i++) {
        Usuario usuario = ListaUsuario.get(i);
        if(usuario != null){
            return usuario;
        }
    }
    return null;
}

public boolean AgregarUsuario(Usuario usuario){

    Usuario usuario1 = BuscarUsuario(usuario.getNombre_usuario());
    if(usuario == null){
        
        ListaUsuario.add(usuario);
        return true;
    }
    return false;
}

}

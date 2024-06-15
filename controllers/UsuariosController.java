/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Usuarios;


/**
 *
 * @author matto
 */
public class UsuariosController {
    ArrayList<Usuarios> usuario = new ArrayList ();
    int serial = 1;
    
    public void cadastrar (Usuarios u) {
        u.setId(serial);
        usuario.add(u);
        serial += 1;
    }
    public void listar () {
        System.out.println("| LISTA DE USUARIOS |");
        for (int i = 0; i < usuario.size(); i++) {
            usuario.get(i).imprimirAtributos();
            System.out.println();
        }
    System.out.println("| FIM DA LISTA DE USUARIOS |");
    }
    public Usuarios listarUm(int id) {
        for (int i = 0; i < usuario.size(); i++) {
            Usuarios u = usuario.get(i);
            if (id == u.getId()) {
                return u;
            }
        }
        return null;
    }

    public void deletar(Usuarios u) {
        usuario.remove(u);
    }

  
}
    
    

 
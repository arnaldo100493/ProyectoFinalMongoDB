/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.test;

import com.mongodb.DB;
import com.mongodb.dao.DaoContacto;
import com.mongodb.jdbc.DBConnection;
import com.mongodb.model.Contacto;

/**
 *
 * @author E301
 */
public class Main {

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String cedula = "1047459854";
        String nombre = "Arnaldo Andrés";
        String apellido = "Barrios Mena";
        String direccion = "Chile";
        String telefono = "123456";
        String correoElectronico = "arnaldo@hotmail.com";
        boolean sexo = true;

        Contacto contacto = new Contacto(cedula, nombre, apellido, direccion, telefono, correoElectronico, sexo);

        DaoContacto daoContacto = new DaoContacto();
        if (daoContacto.insertar(contacto)) {
            System.out.println("Contacto Registado con Exito");
        } else {
            System.out.println("Ocurrio un error: No se pudo registrado");
        }

    }

}

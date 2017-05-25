/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.interfaces;

import com.mongodb.DB;
import com.mongodb.model.ContactoAmigo;
import java.util.List;

/**
 *
 * @author ArnaldoAndres
 */
public interface InterfaceDaoContactoAmigo {

    public boolean insertar(ContactoAmigo contactoAmigo) throws Exception;

    public ContactoAmigo consultarPorCedula(String cedula) throws Exception;
    
    public ContactoAmigo consultarPorCorreoElectronico(String correoElectronico) throws Exception;

    public List<ContactoAmigo> listar() throws Exception;

    public boolean editar(ContactoAmigo contactoAmigo) throws Exception;

    public boolean eliminar(ContactoAmigo contactoAmigo) throws Exception;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.dao;

import com.mongodb.interfaces.InterfaceDaoContactoAmigo;
import com.mongodb.model.ContactoAmigo;
import java.util.List;

/**
 *
 * @author ArnaldoAndres
 */
public class DaoContactoAmigo implements InterfaceDaoContactoAmigo {

    public DaoContactoAmigo() {

    }

    @Override
    public boolean insertar(ContactoAmigo contactoAmigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContactoAmigo consultarPorCedula(String cedula) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContactoAmigo consultarPorCorreoElectronico(String correoElectronico) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactoAmigo> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(ContactoAmigo contactoAmigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(ContactoAmigo contactoAmigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.interfaces.InterfaceDaoContacto;
import com.mongodb.jdbc.DBConnection;
import com.mongodb.model.Contacto;
import java.util.List;

/**
 *
 * @author FABAME
 */
public class DaoContacto implements InterfaceDaoContacto {

    private DB db;
    private DBCollection dbCollection;

    public DaoContacto() {
        this.db = DBConnection.connectToMongoDB("dbagenda");
        this.dbCollection = this.db.getCollection("contacto");
    }

    @Override
    public boolean insertar(Contacto contacto) throws Exception {
        BasicDBObject document = new BasicDBObject();

        document.put("cedula", "'" + contacto.getCedula() + "'");
        document.put("nombre", "'" + contacto.getNombre() + "'");
        document.put("apellido", "'" + contacto.getApellido() + "'");
        document.put("direccion", "'" + contacto.getDireccion() + "'");
        document.put("telefono", "'" + contacto.getTelefono() + "'");
        document.put("correoElectronico", "'" + contacto.getCorreoElectronico() + "'");
        document.put("sexo", "'" + contacto.isSexo() + "'");
        this.dbCollection.insert(document);

        return true;
    }

    @Override
    public Contacto consultarPorCedula(String cedula) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }

    @Override
    public Contacto consultarPorCorreoElectronico(String correoElectronico) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contacto> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(Contacto contacto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Contacto contacto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.ejb;

import com.mongodb.DB;
import com.mongodb.dao.DaoContacto;
import com.mongodb.interfaces.InterfaceDaoContacto;
import com.mongodb.jdbc.DBConnection;
import com.mongodb.model.Contacto;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ArnaldoAndres
 */
@Stateless
public class EJBContacto {

    private Contacto contacto;
    private List<Contacto> listadoContactos;
    private transient DB db;
    private InterfaceDaoContacto daoContacto;

    public EJBContacto() {
        this.contacto = new Contacto();
        this.daoContacto = new DaoContacto();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public boolean insertar() {
        boolean valorRetorno;
        try {
            this.setDb(DBConnection.connectToMongoDB("agenda"));
            valorRetorno = this.daoContacto.insertar(this.getContacto());
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;

    }

    /**
     * @return the contacto
     */
    public Contacto getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the listadoContactos
     */
    public List<Contacto> getListadoContactos() {
        return listadoContactos;
    }

    /**
     * @param listadoContactos the listadoContactos to set
     */
    public void setListadoContactos(List<Contacto> listadoContactos) {
        this.listadoContactos = listadoContactos;
    }

    /**
     * @return the db
     */
    public DB getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(DB db) {
        this.db = db;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.services;

import com.mongodb.dao.ImplDao;
import com.mongodb.impldao.InterfaceDaoContacto;
import com.mongodb.model.Contacto;

/**
 *
 * @author E301
 */
public class ContactoServices extends ImplDao<Contacto, Long> implements InterfaceDaoContacto {

    public ContactoServices() {

    }

}

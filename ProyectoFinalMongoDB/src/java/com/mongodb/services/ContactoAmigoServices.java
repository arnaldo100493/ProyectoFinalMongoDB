/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.services;

import com.mongodb.dao.ImplDao;
import com.mongodb.impldao.InterfaceDaoContactoAmigo;
import com.mongodb.model.ContactoAmigo;

/**
 *
 * @author E301
 */
public class ContactoAmigoServices extends ImplDao<ContactoAmigo, Long> implements InterfaceDaoContactoAmigo {

    public ContactoAmigoServices() {

    }

}

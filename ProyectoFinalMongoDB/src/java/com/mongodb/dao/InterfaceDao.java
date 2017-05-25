/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.dao;

import java.util.List;

/**
 *
 * @author E301
 */
public interface InterfaceDao<T, ID> {
    
    public boolean create(T object) throws Exception;

    public T find(String parameterValue) throws Exception;

    public List<T> findAll() throws Exception;

    public boolean edit(T object) throws Exception;

    public boolean remove(T object) throws Exception;
  
    
}

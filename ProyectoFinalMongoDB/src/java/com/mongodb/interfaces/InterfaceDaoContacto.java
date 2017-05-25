/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.interfaces;

import com.mongodb.DB;
import com.mongodb.model.Contacto;
import java.util.List;

/**
 *
 * @author E301
 */
public interface InterfaceDaoContacto {

    public boolean insertar(Contacto contacto) throws Exception;

    public Contacto consultarPorCedula(String cedula) throws Exception;
    
     public Contacto consultarPorCorreoElectronico(String correoElectronico) throws Exception;

    public List<Contacto> listar() throws Exception;

    public boolean editar(Contacto contacto) throws Exception;

    public boolean eliminar(Contacto contacto) throws Exception;

}

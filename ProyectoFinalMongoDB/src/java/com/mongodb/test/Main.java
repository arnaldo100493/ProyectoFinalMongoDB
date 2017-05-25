/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.test;

import com.mongodb.DB;
import com.mongodb.jdbc.DBConnection;

/**
 *
 * @author E301
 */
public class Main {
    
    public Main(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DB connection = DBConnection.connectToMongoDB("agenda");
        if(connection != null){
            System.out.println("Conectado...!!!");
        }else{
            System.out.println("No Conectado...!!!");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.jdbc;

import com.mongodb.DB;
import com.mongodb.Mongo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author E301
 */
public class DBConnection {
    
    private static transient Connection connection;

    private static final String derbyJavaDBDriver = "org.apache.derby.jdbc.AutoloadedDriver";
    private static final String mysqlDriver = "com.mysql.jdbc.Driver";
    private static final String oracleThinDriver = "oracle.jdbc.OracleDriver";
    private static final String postgresqlDriver = "org.postgresql.Driver";

    private static String derbyJavaDBUrl = "jdbc:derby://localhost:1527/";
    private static String mysqlUrl = "jdbc:mysql://localhost:3306/";
    private static String oracleThinUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String postgresqlUrl = "jdbc:postgresql://localhost:5432/";

    private static final String mysqlUserName = "root";
    private static final String oracleThinUserName = "system";
    private static final String postgresqlUserName = "postgres";

    private static final String mongodbHost = "localhost";
    private static final int mongodbPort = 27017;

    private static transient DB db;

    public DBConnection() {
        connection = null;
    }

    public DBConnection(Connection con) {
        connection = con;
    }

    public static boolean isConnected() {
        return connection != null || db != null;
    }

    public static Connection connectToDerbyJavaDB(String databaseName, String user, String password) {
        connection = null;
        derbyJavaDBUrl = derbyJavaDBUrl + databaseName;
        try {
            Class.forName(derbyJavaDBDriver);
            connection = DriverManager.getConnection(derbyJavaDBUrl, user, password);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return connection;
        }
    }

    public static Connection connectToMySQL(String databaseName, String password) {
        connection = null;
        mysqlUrl = mysqlUrl + databaseName;
        try {
            Class.forName(mysqlDriver);
            connection = DriverManager.getConnection(mysqlUrl, mysqlUserName, password);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return connection;
        }
    }

    public static DB connectToMongoDB(String databaseName) {
        db = null;
        try {
            Mongo mongo = new Mongo(mongodbHost, mongodbPort);
            db = mongo.getDB(databaseName);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return db;
        }
    }

    public static Connection connectToOracleThin(String password) {
        connection = null;
        try {
            Class.forName(oracleThinDriver);
            connection = DriverManager.getConnection(oracleThinUrl, oracleThinUserName, password);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return connection;
        }
    }

    public static Connection connectToPostgreSQL(String databaseName, String password) {
        connection = null;
        postgresqlUrl = postgresqlUrl + databaseName;
        try {
            Class.forName(postgresqlDriver);
            connection = DriverManager.getConnection(postgresqlUrl, postgresqlUserName, password);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return connection;
        }
    }

    public static void disconnect() {
        if (isConnected()) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        DBConnection.connection = connection;
    }  
    
}

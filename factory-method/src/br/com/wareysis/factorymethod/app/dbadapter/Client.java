package br.com.wareysis.factorymethod.app.dbadapter;

import br.com.wareysis.factorymethod.app.dbadapter.db.DB;
import br.com.wareysis.factorymethod.app.dbadapter.factory.OracleDBFactory;
import br.com.wareysis.factorymethod.app.dbadapter.factory.PostgreSqlFactory;

/**
 * The Client class demonstrates the usage of the factory design pattern to create database connection objects for Oracle and PostgreSQL databases. It executes
 * SQL queries and updates using these database connection objects.
 *
 * @author gilberto.junior
 */
public class Client {

    public static void main(String[] args) {

        DB oracleDB = new OracleDBFactory().getDatabase();
        DB postgreSqlDB = new PostgreSqlFactory().getDatabase();

        System.out.println(oracleDB.query("SELECT * FROM USERS"));
        System.out.println(oracleDB.update("UPDATE USERS SET NOME_USUARIO = 'Gilberto Junior' WHERE ID_USUARIO = 1"));

        System.out.println(postgreSqlDB.query("SELECT * FROM USERS"));
        System.out.println(postgreSqlDB.update("UPDATE USERS SET NOME_USUARIO = 'Gilberto Junior' WHERE ID_USUARIO = 1"));
    }
}

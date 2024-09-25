package br.com.wareysis.factorymethod.app.dbadapter.factory;

import br.com.wareysis.factorymethod.app.dbadapter.db.DB;
import br.com.wareysis.factorymethod.app.dbadapter.db.PostgreSqlDB;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class PostgreSqlFactory implements DBFactory{

    @Override
    public DB getDatabase() {

        return new PostgreSqlDB();
    }
}

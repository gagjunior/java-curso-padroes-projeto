package br.com.wareysis.factorymethod.app.dbadapter.factory;

import br.com.wareysis.factorymethod.app.dbadapter.db.DB;
import br.com.wareysis.factorymethod.app.dbadapter.db.OracleDB;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class OracleDBFactory implements DBFactory {

    @Override
    public DB getDatabase() {

        return new OracleDB();
    }
}

package br.com.wareysis.factorymethod.app.dbadapter.db;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class OracleDB implements DB {

    @Override
    public String query(String sql) {

        return "OracleDB: Executando a query -> " + sql;
    }

    @Override
    public String update(String sql) {

        return "OracleDB: Update com comando -> " + sql;
    }
}

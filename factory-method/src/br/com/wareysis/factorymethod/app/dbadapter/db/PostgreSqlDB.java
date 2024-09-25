package br.com.wareysis.factorymethod.app.dbadapter.db;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class PostgreSqlDB implements DB{

    @Override
    public String query(String sql) {

        return "PostgreSql: Executando a query -> " + sql;
    }

    @Override
    public String update(String sql) {

        return "PostgreSql: Update com query -> " + sql;
    }
}

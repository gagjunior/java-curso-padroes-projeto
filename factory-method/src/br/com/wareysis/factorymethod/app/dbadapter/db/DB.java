package br.com.wareysis.factorymethod.app.dbadapter.db;

public interface DB {
    String query( String sql);
    String update( String sql);
}

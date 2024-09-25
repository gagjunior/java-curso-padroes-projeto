package br.com.wareysis.factorymethod.app.dbadapter.factory;

import br.com.wareysis.factorymethod.app.dbadapter.db.DB;

public interface DBFactory {
    DB getDatabase();
}

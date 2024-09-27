package br.com.wareysis.singleton.connection;

import java.util.ArrayList;
import java.util.List;

import br.com.wareysis.singleton.domain.Connection;


/**
 * The ConnectionPool class manages a pool of database connections.
 * It follows the singleton pattern to ensure that only one instance
 * of the pool exists. The pool pre-creates a fixed number of connections
 * and keeps track of their usage state.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class ConnectionPool {
    private static ConnectionPool singleton = new ConnectionPool();
    public final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for(Connection conn: connectionsPool) {
            if(!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }
        if(avaiable == null) {
            System.out.println("No Connections avaiable");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}

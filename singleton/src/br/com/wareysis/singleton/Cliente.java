package br.com.wareysis.singleton;

import br.com.wareysis.singleton.connection.ConnectionPool;
import br.com.wareysis.singleton.domain.Connection;


/**
 * The Cliente class demonstrates the usage of the ConnectionPool class to manage
 * and perform database queries. It contains methods to run queries on different
 * tables and a main method to execute these queries.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class Cliente {

    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery1();
        doQuery2();
        doQuery3();

    }
}

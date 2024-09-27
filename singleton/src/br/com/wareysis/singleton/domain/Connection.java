package br.com.wareysis.singleton.domain;

/**
 * The Connection class represents a database connection.
 * It provides methods to run queries and manage the connection's in-use status.
 *
 * @author gilberto.junior
 */
public class Connection {
    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
        return null;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean status) {
        inUse = status;
    }
}

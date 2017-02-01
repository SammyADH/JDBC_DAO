package sqldatabase.Sqldatabaseedu.lfa.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface jdbc_interface {

    boolean delete() throws SQLException, ClassNotFoundException;

    Connection open_connection() throws SQLException, ClassNotFoundException;

    void close_connection(Connection con) throws SQLException, ClassNotFoundException;

    ResultSet getbyCat_Id(int x,Connection conn) throws SQLException, ClassNotFoundException;

    ResultSet getbyPrd_Id(int y,Connection conn) throws SQLException, ClassNotFoundException;
    
    // ADD OTHER FUNCTIONS FOR DAO IMPLEMENTATION
}

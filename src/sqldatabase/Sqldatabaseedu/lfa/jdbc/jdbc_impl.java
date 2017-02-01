package sqldatabase.Sqldatabaseedu.lfa.jdbc;

import java.sql.*;

/**
 *
 * @author samyam
 */
public class jdbc_impl implements jdbc_interface {

    @Override
    public boolean delete() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Connection open_connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ecomm", "root", "");
        return conn;
    }

    @Override
    public void close_connection(Connection con) throws SQLException, ClassNotFoundException {
        con.close();
    }

    @Override
    public ResultSet getbyCat_Id(int x,Connection conn) throws SQLException, ClassNotFoundException {
        String sql = "Select * from categories";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet results = ps.executeQuery();
        return results;
    }

    @Override
    public ResultSet getbyPrd_Id(int y,Connection conn) throws SQLException, ClassNotFoundException {
        String sql = "Select * from products";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet results = ps.executeQuery();
        return results;
    }

}

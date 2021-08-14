package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBContext {

    private static Context context;
    private static String dbname, serverName, portNumber, image, username, password;

    public DBContext() throws Exception {
        try {
            if (context == null) {
                InitialContext initial = new InitialContext();
                context = (Context) initial.lookup("java:comp/env");
                serverName = (String) context.lookup("serverName");
                dbname = (String) context.lookup("dbName");
                portNumber = (String) context.lookup("portNumber");
                image = (String) context.lookup("image");
                username = (String) context.lookup("username");
                password = (String) context.lookup("password");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbname;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, username, password);
    }

    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    public String getImagePath() throws Exception {
        return image;
    }
}

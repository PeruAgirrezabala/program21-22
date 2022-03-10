
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteKudeatu {

    /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\agirrezabala.peru\\Documents\\programazioa\\4UD\\HiztegiaSQLite\\db\\Hiztegia.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}


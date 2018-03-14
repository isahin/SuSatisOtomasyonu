package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    final private String url = "org.sqlite.JDBC";
    final private String db = "jdbc:sqlite:db/";
    private String dbName = "Musteriler.db";

    private Connection conn = null;
    private Statement st = null; // tünel yol anlamında gelicek mi gidecek mi anlamında 

    public DB() {

    }

    public DB(String dbName) {
        this.dbName = dbName;
    }

    // baglan methodu kuruluyor
    public Statement baglan() {
        if(st != null && conn !=null){
           
            kapat();
     
        }   else {
        try {
            Class.forName(url);
            conn = DriverManager.getConnection(db + dbName);
            st = conn.createStatement();
            System.out.println("Bağlantı Başarılı");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Bağlantı Hatası : " + e);
        }
  } 
        return st;
    }

    // bağlantı kapat
    public void kapat() {

        if (st != null && conn != null) {

            try {
                st.close();
                conn.close();
                st = null;
                conn = null;
                System.out.println("Bağlantı Kapatıldı");
            } catch (SQLException e) {
                System.err.println("Kapatma Hatası : " + e);
            }
        }
    }
}

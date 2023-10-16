package apk_laundry_ukk.rpl2;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/pdm_rpl2";
    private String username = "root";
    private String password = "";
    private Connection con;
    public void connect (){
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");    
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR KONEKSI KE DATABASE:\n"+ e);
                 
        }
    
}
 
public Connection getCon () {
    return con;
}
}
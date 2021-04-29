package nl.windesheim.bam24.demokbsm2.jdbcdemo.db;
import java.sql.*;

public class TestDB {
    private String url = "jdbc:mysql://localhost/nerdygadgets";
    private String username="root", password="";
    private Connection connection;

    public TestDB() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        /*catch (ClassNotFoundException cnfe){
            System.out.println("Kan class com.mysql.jdbc.Driver niet vinden!");
        }*/
        catch (SQLException se){
            System.out.println("Kan geen verbinding leggen met " + url);
        }
    }
    public void PrintRepublics() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM nerdygadgets.countries WHERE FormalName LIKE '%republic%'");
            while (rs.next()) {
                String korteNaam = rs.getString("CountryName");
                String langeNaam = rs.getString("FormalName");
                System.out.println(korteNaam + " = " + langeNaam);
            }
            stmt.close();
        } catch (SQLException se) {
            System.out.println("Boehoe! Kan republieken niet ophalen!");
        }
    }
    public void close() {
        try {
            connection.close();
        } catch (SQLException se) {
            System.out.println("Huh, can't close?!?");
        }
    }
}

package nl.windesheim.bam24.demokbsm2.jdbcdemo.db;

import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.Design;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.ServerType;

import java.sql.*;
import java.util.ArrayList;

public class MySQLDesignDb implements DesignDb {
    private String url = "jdbc:mysql://localhost/infradesigns";
    private String username="root", password="";
    private Connection connection;

    @Override
    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    @Override
    public void disconnect() throws SQLException {
        connection.close();
    }

    @Override
    public ArrayList<Design> getDesigns() throws SQLException {
        ArrayList<Design> designs = new ArrayList<>();

        String zoekTerm = "Martijn";
        String query = "SELECT * FROM infradesigns.designs WHERE owner = ?";

        /*
        // TESTING
        ServerType type = new ServerType();
        Design design = new Design();
        design.addServer(type);
        designs.add(design);
        */
        //Statement statement = connection.createStatement();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, zoekTerm);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Design design = new Design();
            design.setName(rs.getString("name"));
            design.setOwner(rs.getString("owner"));
            designs.add(design);
        }

        statement.close();

        return designs;
    }

    @Override
    public Design getDesign(String name) {
        return null;
    }

    @Override
    public ArrayList<ServerType> getServerTypes() {
        return null;
    }
}

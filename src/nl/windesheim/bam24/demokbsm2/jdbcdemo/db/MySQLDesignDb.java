package nl.windesheim.bam24.demokbsm2.jdbcdemo.db;

import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.Design;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.ServerType;

import java.sql.Connection;
import java.util.ArrayList;

public class MySQLDesignDb implements DesignDb {
    private String url = "jdbc:mysql://localhost/nerdygadgets";
    private String username="root", password="";
    private Connection connection;

    @Override
    public void connect() {

    }

    @Override
    public void disconnect() {

    }

    @Override
    public ArrayList<Design> getDesigns() {
        ArrayList<Design> designs = new ArrayList<>();

        // TESTING
        ServerType type = new ServerType();
        Design design = new Design();
        design.addServer(type);
        designs.add(design);

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

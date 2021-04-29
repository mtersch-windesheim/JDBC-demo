package nl.windesheim.bam24.demokbsm2.jdbcdemo.db;

import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DesignDb {
    void connect() throws SQLException;
    void disconnect() throws SQLException;
    ArrayList<Design> getDesigns() throws SQLException;
    Design getDesign(String name);
    ArrayList<ServerType> getServerTypes();
}

package nl.windesheim.bam24.demokbsm2.jdbcdemo.db;

import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.*;
import java.util.ArrayList;

public interface DesignDb {
    void connect();
    void disconnect();
    ArrayList<Design> getDesigns();
    Design getDesign(String name);
    ArrayList<ServerType> getServerTypes();
}

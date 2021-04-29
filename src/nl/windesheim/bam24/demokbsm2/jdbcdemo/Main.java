package nl.windesheim.bam24.demokbsm2.jdbcdemo;

import nl.windesheim.bam24.demokbsm2.jdbcdemo.db.DesignDb;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.db.MySQLDesignDb;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.db.TestDB;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.Design;
import nl.windesheim.bam24.demokbsm2.jdbcdemo.models.ServerType;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	    // write your code here
        DesignDb db = new MySQLDesignDb();
        try {
            db.connect();
            ArrayList<Design> designs = db.getDesigns();
            for (Design design : designs) {
                System.out.println(design + "\n");
            }
            db.disconnect();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}

package nl.windesheim.bam24.demokbsm2.jdbcdemo.models;

import java.util.*;

public class Design {
    private String name, owner;
    private Hashtable<ServerType, Integer> servers;

    public Design() {
        this("<new name>");
    }
    public Design(String name) {
        this(name, "<new owner>");
    }
    public Design(String name, String owner) {
        this.name = name;
        this.owner = owner;
        servers = new Hashtable<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public void addServer(ServerType serverType) {
        servers.put(serverType, servers.getOrDefault(serverType, 0) + 1);
    }

    @Override
    public String toString() {
        String serverlist = "";
        for (Map.Entry<ServerType, Integer> serverSet : servers.entrySet()) {
            serverlist += "<" + serverSet.getKey().getName() + ": " + serverSet.getValue() + ">";
        }

        return "Design {" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", servers=" + serverlist +
                '}';
    }
}

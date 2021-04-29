package nl.windesheim.bam24.demokbsm2.jdbcdemo.models;

public class ServerType {
    private String name, kind;
    private int price;
    private double failrate;

    public ServerType() {
        //
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getFailrate() {
        return failrate;
    }
    public void setFailrate(double failrate) {
        this.failrate = failrate;
    }
}

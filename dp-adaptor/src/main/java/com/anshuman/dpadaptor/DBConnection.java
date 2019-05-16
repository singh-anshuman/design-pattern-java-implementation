package com.anshuman.dpadaptor;

public interface DBConnection {

    public void connect();
    public void save(String data);
    public String find();

}

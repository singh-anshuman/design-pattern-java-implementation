package com.anshuman.dpadaptor;

public class DBOneDBConnection implements DBConnection {

    public void connect() {
        System.out.println("DB One Connected !");
    }

    public void save(String data) {
        System.out.println(data + " saved in DB One");
    }

    public String find() {
        return "DB One Data";
    }
}

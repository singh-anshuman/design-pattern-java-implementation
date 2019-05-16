package com.anshuman.dpadaptor;

public class DBTwoDBConnection implements DBConnection {

    public void connect() {
        System.out.println("DB Two Connected !");
    }

    public void save(String data) {
        System.out.println(data + " saved in DB Two");
    }

    public String find() {
        return "DB Two Data";
    }
}

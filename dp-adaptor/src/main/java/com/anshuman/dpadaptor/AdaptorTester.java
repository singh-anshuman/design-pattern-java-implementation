package com.anshuman.dpadaptor;

public class AdaptorTester {

    public static void main(String[] args) {
        ServerApplication s1 = new ServerApplication(new DBOneDBConnection());
        ServerApplication s2 = new ServerApplication(new DBTwoDBConnection());

        s1.getDbConnection().connect();
        s1.getDbConnection().save("Anshuman");
        System.out.println(s1.getDbConnection().find());

        s2.getDbConnection().connect();
        s2.getDbConnection().save("Aditya");
        System.out.println(s2.getDbConnection().find());
    }
}

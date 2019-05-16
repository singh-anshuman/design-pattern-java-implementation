package com.anshuman.dpadaptor;

public class ServerApplication {

    private DBConnection dbConnection;

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    public ServerApplication(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}

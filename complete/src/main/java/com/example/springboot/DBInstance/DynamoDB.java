package com.example.springboot.DBInstance;

public final class DynamoDB {

    private static volatile DynamoDB dynamoDB;
    private String connectionString;

    private DynamoDB(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DynamoDB getDynamoDBInstance(String connectionString) {
        DynamoDB ddb = dynamoDB;
        if (ddb == null) {
            synchronized (DynamoDB.class) {
                ddb = dynamoDB;
                if (ddb == null) {
                    dynamoDB = ddb = new DynamoDB(connectionString);
                }
            }
        }
        return ddb;
    }
}

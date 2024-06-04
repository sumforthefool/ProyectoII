package com.miproyecto;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import javax.swing.text.Document;

public class MongoDBDAO {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoDBDAO() {

        mongoClient = MongoClients.create( "mongodb://localhost:27017");
        database  = mongoClient.getDatabase("PruebaP2");
        collection = database.getCollection("Persona");

    }

}

package com.miproyecto;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoDBDAO {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoDBDAO() {

        Dotenv dotenv = Dotenv.load();
        String mongoDBURL = dotenv.get("MONGODB_URL");
        String mongoDBDatabase = dotenv.get("MONGODB_DATABASE");
        String mongoDBCollection = dotenv.get("MONGODB_COLLECTION");

        mongoClient = MongoClients.create(mongoDBURL);
        database = mongoClient.getDatabase(mongoDBDatabase);
        collection = database.getCollection("Persona");
    }

    public void insertarPersona(Persona persona) {
        Document document = new Document("_id", persona.getId())
                .append("nombre", persona.getNombre())
                .append("apellido", persona.getApellido())
                .append("edad", persona.getEdad());

        collection.insertOne(document);
    }

    public Persona obtenerPersonaPorId(int id) {
        Document document = collection.find(new Document("_id", id)).first();
        if (document != null) {
            return new Persona(
                    document.getInteger("_id"),
                    document.getString("nombre"),
                    document.getString("apellido"),
                    document.getInteger("edad")
            );
        } else {
            return null;
        }
    }

    public List<Persona> obtenerTodasLasPersonas() {
        List<Persona> personas = new ArrayList<>();
        for (Document document : collection.find()) {
            personas.add(new Persona(
                    document.getInteger("_id"),
                    document.getString("nombre"),
                    document.getString("apellido"),
                    document.getInteger("edad")
            ));
        }
        return personas;
    }

    public void actualizarPersona(Persona persona) {
        Document filter = new Document("_id", persona.getId());
        Document update = new Document("$set",
                new Document("nombre", persona.getNombre())
                        .append("apellido", persona.getApellido())
                        .append("edad", persona.getEdad()));
        collection.updateOne(filter, update);
    }

    public void eliminarPersona(int id) {
        Document filter = new Document("_id", id);
        collection.deleteOne(filter);
    }

}

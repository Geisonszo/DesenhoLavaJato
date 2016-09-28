package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseConnection {

    private static DatabaseConnection instance;


    public static DatabaseReference establishConnection() {

        DatabaseReference connection = FirebaseDatabase.getInstance().getReference();

        return connection;
    }

    private static DatabaseConnection getInstance(){

        if(instance == null){

            instance = new DatabaseConnection();
        }
        else{
            //Do nothing!
        }

        return instance;
    }


    private FirebaseDatabase getConnection() {

        FirebaseDatabase connection;

        connection =  FirebaseDatabase.getInstance();

        return connection;
    }
}

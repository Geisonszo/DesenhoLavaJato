package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FactoryConnection {

    private static FactoryConnection instance;

    static FactoryConnection getInstance () {

        if(instance == null){

            instance = new FactoryConnection();
        } else {

            //Do nothing!
        }

        return instance;
    }

    public DatabaseReference getConnection() {

        return getFirebaseRefenrece();
    }


    private DatabaseReference getFirebaseRefenrece() {

        DatabaseReference firebase;

        firebase = FirebaseDatabase.getInstance().getReferenceFromUrl("https://lavajato-adcfb.firebaseio.com");
        return firebase;
    }
}
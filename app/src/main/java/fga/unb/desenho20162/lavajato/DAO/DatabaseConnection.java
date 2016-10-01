package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseConnection {

    private final static String FIREBASE_URL = "https://lavajato-adcfb.firebaseio.com";

    final private DatabaseReference firebase = FirebaseDatabase.getInstance()
            .getReferenceFromUrl(FIREBASE_URL);

    public DatabaseReference getFirebase () {
        return firebase;
    }
}
package com.example.computersiencetest;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    FirebaseServices instance;
    FirebaseAuth auth;
    FirebaseStorage storage;
    FirebaseFirestore fire;

    public FirebaseServices(){
        auth = FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();
        fire = FirebaseFirestore.getInstance();
    }

    public FirebaseServices getInstance() {
        return instance;
    }

    public void setInstance(FirebaseServices instance) {
        this.instance = instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    public void setAuth(FirebaseAuth auth) {
        this.auth = auth;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    public void setStorage(FirebaseStorage storage) {
        this.storage = storage;
    }

    public FirebaseFirestore getFire() {
        return fire;
    }

    public void setFire(FirebaseFirestore fire) {
        this.fire = fire;
    }
}

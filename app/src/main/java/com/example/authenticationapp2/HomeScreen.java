package com.example.authenticationapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeScreen extends AppCompatActivity {

    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        fAuth = FirebaseAuth.getInstance();
    }

    public void logoutUser(View view) {
        fAuth.signOut();
        Intent intent = new Intent(HomeScreen.this, LoginScreen.class);
        startActivity(intent);
        Toast.makeText(HomeScreen.this, "User is logged out", Toast.LENGTH_SHORT).show();
    }
}
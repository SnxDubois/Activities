package com.example.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button send;
    send = (Button) findViewById(R.id.button);

    send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText login = findViewById(R.id.login);
            String loginText = login.getText().toString();
            Intent loginScreen = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(loginScreen);
            loginScreen.putExtra("loginName", loginText);
            Toast toast = Toast.makeText(getApplicationContext(), loginText, Toast.LENGTH_LONG);
            toast.show();

        }

    });





    }
}

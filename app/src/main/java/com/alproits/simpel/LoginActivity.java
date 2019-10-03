package com.alproits.simpel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        Button btnLoginGuru = (Button) findViewById(R.id.btnLoginGuru);
        Button btnLoginWaliMurid = (Button) findViewById(R.id.btnLoginWaliMurid);
        btnLoginGuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNavigationDrawer();
            }
        });

        btnLoginWaliMurid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTeacherNavigationDrawer();
            }
        });
    }

    public void startNavigationDrawer(){
        Intent intent = new Intent(this,NavigationDrawer.class);
        startActivity(intent);
    }

    public void startTeacherNavigationDrawer(){
        Intent intent = new Intent(this,TeacherNavigationDrawer.class);
        startActivity(intent);
    }
}

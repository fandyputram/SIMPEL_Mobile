package com.alproits.simpel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        Button btnLoginGuru = findViewById(R.id.btnLoginGuru);
        Button btnLoginWaliMurid = findViewById(R.id.btnLoginWaliMurid);
        btnLoginGuru.setOnClickListener(this);
        btnLoginWaliMurid.setOnClickListener(this);
    }

    public void startNavigationDrawer(){
        Intent intent = new Intent(this,NavigationDrawer.class);
        startActivity(intent);
        finish();
    }

    public void startTeacherNavigationDrawer(){
        Intent intent = new Intent(this,TeacherNavigationDrawer.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLoginGuru:
                startTeacherNavigationDrawer();
                break;
            case R.id.btnLoginWaliMurid:
                startNavigationDrawer();
                break;
        }

    }
}

package com.example.monitoringsbh.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.monitoringsbh.R;

public class LoginActivity extends AppCompatActivity {
    private ImageButton visPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // disallowed dark mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        EditText password = findViewById(R.id.passwordtext);
        visPass = findViewById(R.id.show_pass1);


        visPass.setImageResource(R.drawable.ic_eye_off);
        visPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getInputType() == InputType.TYPE_CLASS_TEXT){
                    visPass.setImageResource(R.drawable.ic_eye_off);
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                } else {
                    visPass.setImageResource(R.drawable.ic_eye);
                    password.setInputType(InputType.TYPE_CLASS_TEXT);
                }
                password.setSelection(password.length());
            }
        });

    }
}
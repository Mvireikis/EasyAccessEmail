package com.example.matas.easyaccessemail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MenuActivity extends AppCompatActivity {

    private Button send_new;
    private Button Inbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button button_send_new = findViewById(R.id.sendNew);
         Button inbox_button = findViewById(R.id.button_inbox);

        button_send_new.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   openMainActivity();

                                               }
                                           });

        inbox_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReadEmails();
            }
        });
    }

        public void openMainActivity(){
            Intent intent = new Intent(this, SendEmail.class);
            startActivity(intent);

            }

        public void openReadEmails(){
        Intent intent = new Intent(this,ReadEmails.class);
        startActivity(intent);
        }


    }



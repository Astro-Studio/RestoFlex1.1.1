package com.re1.restoflex;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        io.realm.Realm.init(this);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);
        if (firstStart) {
            showStartDialog(); //ayhmam's dialog box display at 1st boot
        }

        Button buttonlogin = (Button) findViewById(R.id.buttonlogin);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);



        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,about.class));
            }
        });



        final EditText pass=(EditText) findViewById(R.id.editText2);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, admin.class));

                }


        });
    }

    private void showStartDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Choose Your Language:");
        String[] langs = {"English", "Arabic", "Russian", "Turkish", "French"};
        builder.setItems(langs, new DialogInterface.OnClickListener()  {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();

                    }
                })
                .create().show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply(); //ayhmam's dialog box display at 1st boot
    }
}




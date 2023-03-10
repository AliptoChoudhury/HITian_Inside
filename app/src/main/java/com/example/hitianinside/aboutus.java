package com.example.hitianinside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aboutus extends AppCompatActivity {
    ImageView instagram,facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_aboutus);

        instagram=findViewById(R.id.imageinsta);
        facebook=findViewById(R.id.imageface);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAppLink = "https://m.facebook.com/100063835578190/";
                String sPackage = "com.facebook.katana";
                String sWebLink = "https://www.facebook.com/HITian.Inside";
                openLink(sAppLink,sPackage,sWebLink);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAPPLink = "https://www.instagram.com/hitianinside";
                String sPackage = "com.instagram.android";
                openLink(sAPPLink,sPackage,sAPPLink);
            }
        });
    }

    private void openLink(String sAppLink, String sPackage, String sWebLink) {
        try {
            Uri uri = Uri.parse(sAppLink);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);
            intent.setPackage(sPackage);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException activityNotFoundException){
            Uri uri = Uri.parse(sWebLink);
            Intent intent= new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

}
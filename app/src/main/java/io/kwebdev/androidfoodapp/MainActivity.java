package io.kwebdev.androidfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainCoursesCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainCoursesCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // any time you want to move to a new screen in Android, it must be done with intents
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainCoursesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this, DesertsActivity.class);

                startActivity(dessertsActivityIntent);
            }
        });

        // Intent to open email app when click on email address
        TextView emailTextView = findViewById(R.id.text_view_email);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:krseven@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}
package com.noosbit.wikimx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);

        /**
         * Creating all buttons instances
         * */
        // Dashboard News feed button
        Button btn_newsfeed = (Button) findViewById(R.id.btn_periodos);

        // Dashboard Friends button
        Button btn_friends = (Button) findViewById(R.id.btn_curiosidades);

        // Dashboard Messages button
        Button btn_messages = (Button) findViewById(R.id.btn_bartes);

        // Dashboard Places button
        Button btn_places = (Button) findViewById(R.id.btn_baul);

        // Dashboard Events button
        Button btn_events = (Button) findViewById(R.id.btn_atlas);

        // Dashboard Photos button
        Button btn_photos = (Button) findViewById(R.id.btn_lugares);

        /**
         * Handling all button click events
         * */

        // Listening to News Feed button click
        btn_newsfeed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), PeriodosActivity.class);
                startActivity(i);
            }
        });

        // Listening Friends button click
        btn_friends.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), CuriosidadesActivity.class);
                startActivity(i);
            }
        });

        // Listening Messages button click
        btn_messages.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), BartesActivity.class);
                startActivity(i);
            }
        });

        // Listening to Places button click
        btn_places.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), BaulActivity.class);
                startActivity(i);
            }
        });

        // Listening to Events button click
        btn_events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), AtlasActivity.class);
                startActivity(i);
            }
        });

        // Listening to Photos button click
        btn_photos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(), LugaresActivity.class);
                startActivity(i);
            }
        });
    }
}
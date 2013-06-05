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
         * Creación de las instancias de cada botón
         * */
        Button btn_newsfeed = (Button) findViewById(R.id.btn_periodos);

        Button btn_friends = (Button) findViewById(R.id.btn_curiosidades);

        Button btn_messages = (Button) findViewById(R.id.btn_bartes);

        Button btn_places = (Button) findViewById(R.id.btn_baul);

        Button btn_events = (Button) findViewById(R.id.btn_atlas);

        Button btn_photos = (Button) findViewById(R.id.btn_lugares);

        /**
         * Manejo de eventos de los botónes
         * */

        btn_newsfeed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), PeriodosActivity.class);
                startActivity(i);
            }
        });

        btn_friends.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), CuriosidadesActivity.class);
                startActivity(i);
            }
        });

        btn_messages.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), BartesActivity.class);
                startActivity(i);
            }
        });

        btn_places.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), BaulActivity.class);
                startActivity(i);
            }
        });

        btn_events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), AtlasActivity.class);
                startActivity(i);
            }
        });

        btn_photos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), LugaresActivity.class);
                startActivity(i);
            }
        });
    }
}
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
        Button btn_periodos = (Button) findViewById(R.id.btn_periodos);

        Button btn_curiosidades = (Button) findViewById(R.id.btn_curiosidades);

        Button btn_bartes = (Button) findViewById(R.id.btn_bartes);

        Button btn_baul = (Button) findViewById(R.id.btn_baul);

        Button btn_atlas = (Button) findViewById(R.id.btn_atlas);

        Button btn_lugares = (Button) findViewById(R.id.btn_lugares);

        /**
         * Manejo de eventos de los botónes
         * */

        btn_periodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), PeriodosActivity.class);
                startActivity(i);
            }
        });

        btn_curiosidades.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), CuriosidadesActivity.class);
                startActivity(i);
            }
        });

        btn_bartes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), BartesActivity.class);
                startActivity(i);
            }
        });

        btn_baul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), BaulActivity.class);
                startActivity(i);
            }
        });

        btn_atlas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), AtlasActivity.class);
                startActivity(i);
            }
        });

        btn_lugares.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Lanzar pantalla
                Intent i = new Intent(getApplicationContext(), LugaresActivity.class);
                startActivity(i);
            }
        });
    }
}
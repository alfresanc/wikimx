package com.noosbit.wikimx;

import android.app.Activity;
import android.os.Bundle;

public class CuriosidadesActivity extends Activity {
    /** Llamada cuando el activity es creado por primera vez. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curiosidades_layout);
    }
}
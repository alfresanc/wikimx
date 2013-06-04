package com.noosbit.wikimx;

import android.app.Activity;
import android.os.Bundle;

public class AtlasActivity extends Activity {
    /** Llamada cuando el activity es creado por primera vez. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atlas_layout);
    }
}
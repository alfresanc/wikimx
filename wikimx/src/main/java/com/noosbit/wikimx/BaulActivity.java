package com.noosbit.wikimx;

import android.app.Activity;
import android.os.Bundle;

public class BaulActivity extends Activity {
    /** Llamada cuando el activity es creado por primera vez. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baul_layout);
    }
}
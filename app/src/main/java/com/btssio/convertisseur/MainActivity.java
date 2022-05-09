package com.btssio.convertisseur;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spListe;
    private Spinner spListe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spListe= (Spinner) findViewById(R.id.spListe);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.niveau, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spListe.setAdapter(adapter);

        spListe1= (Spinner) findViewById(R.id.spListe1);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.niveau1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spListe1.setAdapter(adapter);
    }
}
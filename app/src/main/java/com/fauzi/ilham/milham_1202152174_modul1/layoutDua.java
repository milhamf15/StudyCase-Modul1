package com.fauzi.ilham.milham_1202152174_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class layoutDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_dua);

        Intent i = getIntent();

        int harga = i.getIntExtra("harga", 0);
        int porsi = i.getIntExtra("porsi", 0);
        int jumlahHarga = harga*porsi;

        String menu = i.getStringExtra("menu");
        String tempatMakan =i.getStringExtra("tempatmakan");
        String toast ="Disini aja makan malamnya ya";

        TextView t1 =findViewById(R.id.tempatMakan);
        TextView t2 =findViewById(R.id.makanan);
        TextView t3 =findViewById(R.id.porsi);
        TextView t4 =findViewById(R.id.harga);

        t1.setText(tempatMakan);
        t2.setText(menu);
        t3.setText(""+porsi);
        t4.setText(""+jumlahHarga);

        if (jumlahHarga>60000){
            toast ="Jangan disini makan malamnya, uang kamu tidak cukup.";
        }

        Toast toast1=Toast.makeText(getApplicationContext(),toast, Toast.LENGTH_LONG);
        toast1.show();
    }




}

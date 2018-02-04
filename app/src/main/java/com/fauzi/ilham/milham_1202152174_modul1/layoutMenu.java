package com.fauzi.ilham.milham_1202152174_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class layoutMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menu);
    }
    public void btneatbus (View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText1 = (EditText) findViewById(R.id.editText2);

        String menu = editText.getText().toString();
        String porsi = editText1.getText().toString();
        int jumlah = Integer.parseInt(porsi);
        Intent i = new Intent(layoutMenu.this, layoutDua.class);

        i.putExtra("menu", menu);
        i.putExtra("porsi", jumlah);
        i.putExtra("tempatmakan", "Eatbus");
        i.putExtra("harga", 50000);

        startActivity(i);

    }

    public void btnabnormal (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText1 = (EditText) findViewById(R.id.editText2);

        String menu = editText.getText().toString();
        String porsi = editText1.getText().toString();
        int jumlah = Integer.parseInt(porsi);

        Intent i2 = new Intent(layoutMenu.this, layoutDua.class);


        i2.putExtra("menu", menu);
        i2.putExtra("porsi", jumlah);
        i2.putExtra("tempatmakan", "Abnormal");
        i2.putExtra("harga", 30000);
        startActivity(i2);
    }
}

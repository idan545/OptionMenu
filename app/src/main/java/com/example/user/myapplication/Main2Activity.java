package com.example.user.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ln=findViewById(R.id.ln3);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 250, "Green");
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String oper = item.getTitle().toString();
        if (oper.equals("Green")) {
            ln.setBackgroundColor(Color.GREEN);
        }
        if (oper.equals ("Red")) {
            ln.setBackgroundColor(Color.RED);
        }
        if (oper.equals("Yellow")) {
            ln.setBackgroundColor(Color.YELLOW);
        }
        if (oper.equals("Black")) {
            ln.setBackgroundColor(Color.BLACK);
        }
        return true;
    }
}
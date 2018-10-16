package com.example.user.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.user.myapplication.R.menu.main;

public class MainActivity extends AppCompatActivity implements View.OnCreateContextMenuListener {
    LinearLayout ln;
    String oper;
    Intent t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ln = findViewById(R.id.ln2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        String oper = item.getTitle().toString();
        if (oper.equals ("Red")) {
            ln.setBackgroundColor(Color.RED);
        }
        if (oper.equals("Yellow")) {
            ln.setBackgroundColor(Color.YELLOW);
        }
        if (oper.equals("Black")) {
            ln.setBackgroundColor(Color.BLACK);
        }
        return super.onContextItemSelected(item);
    }

    public void Go(View view) {
        t1 = new Intent(this, Main2Activity.class);
        startActivity(t1);
    }
}



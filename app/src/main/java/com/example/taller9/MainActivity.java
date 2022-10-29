package com.example.taller9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3");

        tab1.setIndicator("Red");
        tab1.setContent(R.id.tab1);

        tab2.setIndicator("Blue");
        tab2.setContent(R.id.tab2);

        tab3.setIndicator("Orange");
        tab3.setContent(R.id.tab3);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        Button btnYoutube = (Button)findViewById(R.id.btnYoutube);
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }
        });

        Button btnFacebook = (Button)findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://es-la.facebook.com/"));
                startActivity(i);
            }
        });

        Button btnGithub = (Button)findViewById(R.id.btnGithub);
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/"));
                startActivity(i);
            }
        });

        Button btnTwiter = (Button)findViewById(R.id.btnTwiter);
        btnTwiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/?lang=es"));
                startActivity(i);
            }
        });

        Button btnLinkedin = (Button)findViewById(R.id.btnLinkedin);
        btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://co.linkedin.com/"));
                startActivity(i);
            }
        });

        getSupportActionBar().setTitle("TALLER 11");

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id==R.id.item1 || id==R.id.item2 || id==R.id.item3) {
//            Toast.makeText(this, "message!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
        }


}